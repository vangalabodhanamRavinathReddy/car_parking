package com.parking;

public class Driver {
    private String name;
    private Announcement message = new Announcement();

    public Driver(String name) {
        super();
        this.name = name;
    }
    public void notification() {
        System.out.println("Hello, " + name + " " + message.title);
    }
    public void joinDepartment(Announcement mess) {
        message = mess;
    }
}
