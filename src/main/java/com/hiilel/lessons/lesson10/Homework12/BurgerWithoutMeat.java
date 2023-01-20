package com.hiilel.lessons.lesson10.Homework12;

public class BurgerWithoutMeat extends Burger {
    public BurgerWithoutMeat(String bun, String cheese, String green, String mayo) {
        this.bun = bun;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        System.out.println(printBurgerMethod());
    }

    String printBurgerMethod() {
        return "\nVegetarian burger (without meat) " + "\nBun: " + bun + "\nCheese: " + cheese + "\nGreen: " + green +
                "\nMayo: " + mayo;
    }
}
