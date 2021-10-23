package com.parking;

import java.util.*;

public class Login {

    public String adminLogin(){
        System.out.print("Please use admin as username and password ");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter username- ");
        String userName = sc.nextLine();
        System.out.print("Enter password- ");
        String password = sc.nextLine();

        if ( userName.equals("admin") ) {
            if ( password.equals("admin")) {
                System.out.println("login successful");
                return "success";
            } else {
                System.out.println("wrong password");
                return "failed";
            }
        } else {
            System.out.println("Wrong username");
            return "failed";
        }
    }

}
