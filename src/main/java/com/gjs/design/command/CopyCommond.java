package com.gjs.design.command;

public class CopyCommond implements Command {

    @Override
    public String exec(String content) {
        return content + content;
    }

    @Override
    public String undo(String content) {
        return content.substring(0, content.length() / 2);
    }
}
