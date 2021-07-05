package com.gjs.design.command;

public class Main {

    public static void main(String[] args) {
        CommandChain commandChain = new CommandChain("guojinshuai");
        commandChain.exec(new CopyCommond());
        commandChain.exec(new ConcatCommand());

        System.out.println(commandChain.content);
        commandChain.undo();
        System.out.println(commandChain.content);
        commandChain.undo();
        System.out.println(commandChain.content);
        commandChain.undo();
        System.out.println(commandChain.content);
    }
}
