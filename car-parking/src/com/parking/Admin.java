package com.parking;

public class Admin {

    public static void openingAnnouncement()
    {
        Announcement an = new Announcement();
        Driver wor1 = new Driver("Elon");

        an.join(wor1);

        wor1.joinDepartment(an);

        an.upload("Hello, Kindly be notified that the parking will be opening soon. Movements will commence.");
    }

    public static void closingAnnouncement()
    {
        Announcement an = new Announcement();
        Driver wor1 = new Driver("Elon");

        an.join(wor1);

        wor1.joinDepartment(an);

        an.upload("Hello, Kindly be notified that the parking will be closing soon. No movements will be allowed afterwards.");
    }
}
