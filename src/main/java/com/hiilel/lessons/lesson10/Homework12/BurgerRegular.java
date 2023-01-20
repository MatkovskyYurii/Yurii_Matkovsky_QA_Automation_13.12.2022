package com.hiilel.lessons.lesson10.Homework12;

public class BurgerRegular extends Burger {
    public BurgerRegular(String bun, String meat, String cheese, String green, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Regular burger (with all) { " +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayo='" + mayo + '\'' +
                '}';
    }

}
