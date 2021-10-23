package com.parking;

public class Sedan extends Vehicle {
    @Override
    void startSession() {
        System.out.println("Sedan session started");
    }

    @Override
    void endSession() {
        System.out.println("Sedan session ended");
    }
}
