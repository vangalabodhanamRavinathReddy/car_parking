package com.parking;

import java.util.*;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

	    Login l = new Login();
        String logRes = l.adminLogin();
        if(logRes == "success"){
            Admin adm = new Admin();
            adm.openingAnnouncement();
            SUV suv = new SUV();
            suv.park();
        } else {
            System.out.println("Please Login to proceed");
        }

    }
}
