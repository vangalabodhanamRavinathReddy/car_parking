package com.parking.iterator;

import com.parking.Vehicle;

public class VehicleCollection implements Collection
{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Car[] v;

    public VehicleCollection()
    {
        v = new Car[MAX_ITEMS];

        addVehicle("Coupe added to parking system");
        addVehicle("minivan added to parking system");
    }

    public void addVehicle(String str)
    {
        Car c = new Car(str) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            v[numberOfItems] = c;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new VehicleIterator(v);
    }

}
