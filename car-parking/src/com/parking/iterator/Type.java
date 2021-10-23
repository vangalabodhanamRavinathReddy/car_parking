package com.parking.iterator;

public class Type
{
    VehicleCollection v;

    public Type(VehicleCollection v)
    {
        this.v = v;
    }

    public void printVehicles()
    {
        Iterator iterator = v.createIterator();
        System.out.println("-------Adding cars to parking system ------------");
        while (iterator.hasNext())
        {
            Car n = (Car)iterator.next();
            System.out.println(n.getCars());
        }
    }
}

