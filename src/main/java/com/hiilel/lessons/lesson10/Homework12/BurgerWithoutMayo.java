package com.hiilel.lessons.lesson10.Homework12;

public class BurgerWithoutMayo extends Burger {
    public BurgerWithoutMayo(String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;

        System.out.println();
        System.out.println("Diet burger (without mayo)");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Green: " + green);
    }
}
