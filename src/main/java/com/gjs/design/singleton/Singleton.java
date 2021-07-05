package com.gjs.design.singleton;

/**
 * @author guojs
 * @create 2019/12/4
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        return Inner.instance;
    }

    private static class Inner {
        private static Singleton instance = new Singleton();
    }
}
