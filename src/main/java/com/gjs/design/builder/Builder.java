package com.gjs.design.builder;

/**
 * @author guojs
 * @create 2019/11/7
 */
public abstract class Builder {
    abstract Builder name(String name);
    abstract Builder sex(String sex);
    abstract Builder age(int age);

    public abstract Person build();
}
