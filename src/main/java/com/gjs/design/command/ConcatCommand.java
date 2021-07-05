package com.gjs.design.command;

public class ConcatCommand implements Command {

    @Override
    public String exec(String content) {
        return content + "1";
    }

    @Override
    public String undo(String content) {
        return content.substring(0, content.length() - 1);
    }
}
