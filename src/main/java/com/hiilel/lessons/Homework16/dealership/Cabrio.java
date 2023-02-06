package com.hiilel.lessons.Homework16.dealership;


import com.hiilel.lessons.Homework16.abstractValues.Platform;
import com.hiilel.lessons.Homework16.enams.Warranty;

public class Cabrio extends Platform  {
    private final Warranty warranty;

    public Cabrio(int price, String make, String model, Warranty warranty) {
        super(price, make, model);
        this.warranty = warranty;
    }
    @Override
    public String toString() {
        return "Platform = Cabrio," +
                " Price = " + getPrice() + "$" +
                ", make = " + getMake() +
                ", model = " + getModel()  +
                ", Warranty = " + warranty.toString()  +
                ", used car price after 3 year = " + threeYearUsed() + "$";
    }

    @Override
    public int threeYearUsed() {
        double countFactor = 0.60;
        return (int) (getPrice() * countFactor);
    }
}
