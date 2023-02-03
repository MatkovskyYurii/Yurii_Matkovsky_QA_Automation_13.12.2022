package com.hiilel.lessons.Homework16.main;

import com.hiilel.lessons.Homework16.enams.Warranty;
import com.hiilel.lessons.Homework16.dealership.Bus;
import com.hiilel.lessons.Homework16.dealership.Cabrio;
import com.hiilel.lessons.Homework16.dealership.Jeep;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus(37500,"Ford","Transit",Warranty.ONEYEAR);
        Cabrio cab1 = new Cabrio(77899,"Audi","A5", Warranty.TWOYEAR);
        Jeep jeep1 = new Jeep(99950,"Porsche","Cayenne", Warranty.THREEYEAR);

        System.out.println(bus1);
        System.out.println(cab1);
        System.out.println(jeep1);
    }
}
