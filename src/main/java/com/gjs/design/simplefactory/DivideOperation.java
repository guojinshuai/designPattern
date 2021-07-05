package com.gjs.design.simplefactory;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class DivideOperation extends Operation {

    @Override
    public double getResult() {
        if (y == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return x / y;
    }
}
