package com.gjs.design.factorymethod.operation;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return x + y;
    }
}
