package com.hiilel.lessons.lesson15Exception.main2;

public class Math {

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double divide(int a, int b) throws MyIlegaArifmeticalException {
        if (a == 0 && b == 0) {
            throw new NothingToDivide("Both arguments contain zero. Makes not sense ");
        }
        if (b == 0) {
            throw new MyIlegaArifmeticalException("Division by Zero. ");
        }
        return a / b;
    }
}
