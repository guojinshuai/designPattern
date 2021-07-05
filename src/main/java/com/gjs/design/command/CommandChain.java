package com.gjs.design.command;

import java.util.Stack;

public class CommandChain {

    Stack<Command> commands = new Stack<>();
    String content;

    public CommandChain(String content) {
        this.content = content;
    }

    public CommandChain exec(Command command) {
        content = command.exec(content);
        commands.push(command);
        return this;
    }

    public CommandChain undo() {
        if (commands.isEmpty()) {
            return this;
        }
        Command command = commands.pop();
        content = command.undo(content);
        return this;
    }
}
