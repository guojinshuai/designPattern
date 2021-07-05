package com.gjs.design.builder;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Test {

    public static void main(String[] args) {
        Person person = Person.builder()
                .name("guojs")
                .sex("男")
                .age(22)
                .build();
        person.show();
    }
}
