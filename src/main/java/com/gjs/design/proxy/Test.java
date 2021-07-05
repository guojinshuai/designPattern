package com.gjs.design.proxy;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Test {

    public static void main(String[] args) {
        Pursued pursued = new Pursued("meimei");
        Proxy proxy = new Proxy(pursued);
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
