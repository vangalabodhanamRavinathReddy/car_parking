package com.parking;

public abstract class Vehicle {

    abstract void startSession();
    abstract void endSession();

    public final void park(){
        startSession();
    }

    public final void exit(){
        endSession();
    }
}
