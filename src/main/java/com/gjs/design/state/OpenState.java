package com.gjs.design.state;

public class OpenState extends CarState {

    @Override
    public CarState openDoor() {
        System.out.println("OpenState: Can't open!");
        return this;
    }

    @Override
    public CarState closeDoor() {
        System.out.println("OpenState: Closing the door!");
        return new StopState();
    }

    @Override
    public CarState run() {
        System.out.println("OpenState: Can't run!");
        return this;
    }

    @Override
    public CarState stop() {
        System.out.println("OpenState: Can't stop!");
        return this;
    }
}
