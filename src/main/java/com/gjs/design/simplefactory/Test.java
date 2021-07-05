package com.gjs.design.simplefactory;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Test {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setX(2);
        operation.setY(1);
        System.out.println(operation.getResult());
    }
}
