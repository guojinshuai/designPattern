package com.gjs.design.proxy;

/**
 * @author guojs
 * @create 2019/11/7
 */
public class Proxy implements GiftService {

    private Pursuing pursuing;

    public Proxy(Pursued pursued) {
        this.pursuing = new Pursuing(pursued);
    }

    @Override
    public void giveFlowers() {
        pursuing.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuing.giveChocolate();
    }
}
