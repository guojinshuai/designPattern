package com.gjs.design.factorymethod;

import com.gjs.design.factorymethod.leifeng.LeiFeng;
import com.gjs.design.factorymethod.leifeng.LeiFengFactory;
import com.gjs.design.factorymethod.leifeng.StudentFactory;
import com.gjs.design.factorymethod.operation.Operation;
import com.gjs.design.factorymethod.operation.OperationFactory;
import com.gjs.design.factorymethod.operation.SubOperationFactory;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Test {

    public static void main(String[] args) {
        OperationFactory operationFactory = new SubOperationFactory();
        Operation operation = operationFactory.createOperationFactory();
        operation.setX(1);
        operation.setY(2);
        System.out.println(operation.getResult());

        LeiFengFactory leiFengFactory = new StudentFactory();
        LeiFeng leiFeng = leiFengFactory.createFactory();
        leiFeng.buyRice();
        leiFeng.sweep();
        leiFeng.wash();
    }
}
