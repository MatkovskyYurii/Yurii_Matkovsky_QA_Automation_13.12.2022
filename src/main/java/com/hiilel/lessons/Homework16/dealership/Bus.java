package com.hiilel.lessons.Homework16.dealership;

import com.hiilel.lessons.Homework16.intefaces.UsedCarPriceCounter;
import com.hiilel.lessons.Homework16.abstractValues.Platform;
import com.hiilel.lessons.Homework16.enams.Warranty;

public class Bus extends Platform implements UsedCarPriceCounter {

    private final Warranty warranty;

    public Bus(int price, String make, String model, Warranty warranty) {
        super(price, make, model);
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Platform = Bus," +
                " Price = " + getPrice() + "$" +
                ", Make = " + getMake() +
                ", Model = " + getModel() +
                ", Warranty = " + warranty.toString() +
                ", used car price after 3 year = " + threeYearUsed() + "$";
    }

    @Override
    public int threeYearUsed() {
        double countFactor = 0.85;
        return (int) (getPrice() * countFactor);
    }

}
