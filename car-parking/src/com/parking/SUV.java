package com.parking;

public class SUV extends Vehicle {
    @Override
    void startSession() {
        System.out.println("SUV session started");
    }

    @Override
    void endSession() {
        System.out.println("SUV session ended");
    }
}

