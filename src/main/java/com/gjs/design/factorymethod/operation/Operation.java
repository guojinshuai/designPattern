package com.gjs.design.factorymethod.operation;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Operation {

    protected double x;
    protected double y;

    public Operation() {}

    public Operation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getResult() {
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
