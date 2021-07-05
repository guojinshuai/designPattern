package com.gjs.design.command;

public interface Command {
    String exec(String content);
    String undo(String content);
}
