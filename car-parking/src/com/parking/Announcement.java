package com.parking;

import java.util.ArrayList;
import java.util.List;


public class Announcement {
    private List<Driver> members = new ArrayList<>();
    String title;
    public void join(Driver client) {
        members.add(client);
    }
    public void exit(Driver client) {
        members.remove(client);
    }
    public void notifyDrivers() {
        for(Driver member: members) {
            member.notification();
        }
    }
    public void upload(String title) {
        this.title = title;
        notifyDrivers();
    }
}
