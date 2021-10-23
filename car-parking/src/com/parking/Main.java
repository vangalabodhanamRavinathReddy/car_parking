package com.parking;

import com.parking.command.Enroll;
import com.parking.command.Invoker;
import com.parking.command.PayEnrollment;
import com.parking.iterator.VehicleCollection;
import com.parking.iterator.Type;

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
            VehicleCollection nc = new VehicleCollection();
            Type sh = new Type(nc);
            sh.printVehicles();

            PayEnrollment pe = new PayEnrollment();
            Invoker in = new Invoker();
            in.makeEnrollment(pe);
        } else {
            System.out.println("Please Login to proceed");
        }

    }
}
