package com.gjs.design.state;

public abstract class CarState {
    String state;

    abstract CarState openDoor();
    abstract CarState closeDoor();
    abstract CarState run();
    abstract CarState stop();
}
