package com.gjs.design.proxy;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Pursuing implements GiftService {

    private Pursued pursued;

    public Pursuing(Pursued pursued) {
        this.pursued = pursued;
    }

    @Override
    public void giveFlowers() {
        System.out.println(pursued.getName() + ", give you flowers");
    }

    @Override
    public void giveChocolate() {
        System.out.println(pursued.getName() + ", give you chocolate");
    }
}
