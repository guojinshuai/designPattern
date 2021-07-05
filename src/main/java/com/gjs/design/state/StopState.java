package com.gjs.design.state;

public class StopState extends CarState {

    @Override
    CarState openDoor() {
        return new OpenState();
    }

    @Override
    CarState closeDoor() {
        return new CloseState();
    }

    @Override
    CarState run() {
        return new RunningState();
    }

    @Override
    CarState stop() {
        return new StopState();
    }
}
