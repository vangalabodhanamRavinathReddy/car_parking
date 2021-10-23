package com.parking.iterator;

class VehicleIterator implements Iterator
{
    Car[] vList;

    int pos = 0;

    public  VehicleIterator (Car[] vList)
    {
        this.vList = vList;
    }

    public Object next()
    {
        Car veh =  vList[pos];
        pos += 1;
        return veh;
    }

    public boolean hasNext()
    {
        if (pos >= vList.length ||
                vList[pos] == null)
            return false;
        else
            return true;
    }
}
