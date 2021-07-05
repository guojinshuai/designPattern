package com.gjs.design.proxy.v01;

import java.util.Random;

public class Tank implements Movable {


    @Override
    public void move() {
        System.out.println("The tank is moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}

class TankTimeProxy implements Movable {

    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        movable.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

class TankLogProxy implements Movable {
    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start moving");
        movable.move();
        System.out.println("stop moving");
    }
}

interface Movable {

    void move();
}
