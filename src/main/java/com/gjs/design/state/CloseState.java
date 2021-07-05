package com.gjs.design.state;

public class CloseState extends CarState {

    @Override
    CarState openDoor() {
        System.out.println("CloseState: Opening the door");
        return new OpenState();
    }

    @Override
    CarState closeDoor() {
        System.out.println("CloseState: Can't close!");
        return this;
    }

    @Override
    CarState run() {
        System.out.println("CloseState: Running the car!");
        return new RunningState();
    }

    @Override
    CarState stop() {
        System.out.println("CloseState: Stopping the car!");
        return new StopState();
    }
}
