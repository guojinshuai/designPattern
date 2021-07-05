package com.gjs.design.decorate;

/**
 * @author guojs
 * @create 2019/11/6
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person("guojs");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(person);
        bigTrouser.Decorate(tShirts);
        bigTrouser.show();
    }
}
