package com.gjs.design.factorymethod.operation;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class SubOperation extends Operation {

    @Override
    public double getResult() {
        return x - y;
    }
}
