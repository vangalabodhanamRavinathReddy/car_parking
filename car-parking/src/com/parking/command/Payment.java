package com.parking.command;


public class Payment {

    private String car = "SUV - 32AA358";
    private int hours = 10;

    public void pay(){
        System.out.println("Payment for car "+car+", for "+hours+" hours received");
    }
}
