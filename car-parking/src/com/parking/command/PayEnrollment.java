package com.parking.command;

public class PayEnrollment implements Enroll {
    private Payment p;

    public void PayForParking(Payment p){
        p.pay();
    }

    public void execute() {
        p.pay();
    }
}
