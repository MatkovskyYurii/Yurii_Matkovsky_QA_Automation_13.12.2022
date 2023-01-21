package com.hiilel.lessons.lesson10.Homework121;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String green;
    String mayo;

    @Override
    public String toString() {
        return "Burger Regular {" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayo='" + mayo + '\'' +
                '}';
    }

    public Burger(String bun, String meat, String cheese, String green, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        System.out.println(this);
    }

    public Burger(String bun, String meat, String cheese, String green) {
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

    public Burger(String bun, String cheese, String green) {
        this.bun = bun;
        this.cheese = cheese;
        this.green = green;
        System.out.println(printBurgerMethod());
    }
    String printBurgerMethod() {
        return "\nVegetarian burger (without meat & mayo) " + "\nBun: " + bun + "\nCheese: " + cheese + "\nGreen: " + green;
    }
}

