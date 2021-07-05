package com.gjs.design.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSubject {

    List<BaseObserver> observers = new ArrayList<>();

    public abstract void notifyObservers();
}
