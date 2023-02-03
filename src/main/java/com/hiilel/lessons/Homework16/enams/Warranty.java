package com.hiilel.lessons.Homework16.enams;

public enum Warranty {
    ONEYEAR(12),
    TWOYEAR(24),
    THREEYEAR(36);
    final int month;

    Warranty(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return  month + " Month";
    }
}
