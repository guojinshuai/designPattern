package com.gjs.design.factorymethod.operation;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class AddOpertionFactory implements OperationFactory {

    @Override
    public Operation createOperationFactory() {
        return new AddOperation();
    }
}
