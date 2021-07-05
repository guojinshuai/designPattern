package com.gjs.design.simplefactory;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        switch (operate) {
            case "+":
                return new AddOpertation();
            case "-":
                return new SubOperation();
            case "*":
                return new MultifyOperation();
            case "/":
                return new DivideOperation();
            default:
                return new Operation();
        }
    }
}
