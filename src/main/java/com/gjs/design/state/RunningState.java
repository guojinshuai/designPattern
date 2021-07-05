package com.gjs.design.state;

public class RunningState extends CarState {

    @Override
    CarState openDoor() {
        System.out.println("RunningState: Can't open the door!");
        return this;
    }

    @Override
    CarState closeDoor() {
        System.out.println("RunningState: Can't close the door!");
        return this;
    }

    @Override
    CarState run() {
        System.out.println("RunningState: Can't run the car!");
        return this;
    }

    @Override
    CarState stop() {
        System.out.println("RunningState: Stopping the car");
        return null;
    }
}
