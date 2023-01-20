package com.hiilel.lessons.lesson10.Homework12;

public class BurgerMain {
    public static void main(String[] args) {
//      @Override
        BurgerRegular burger1 = new BurgerRegular("Briosh", "Chiken",
                "Chedar", "Iceberg", "Heinz");
//      Sout+values inside Constructor "BurgerWithoutMayo"
        BurgerWithoutMayo burger2 = new BurgerWithoutMayo("Briosh", "Beef", "Chedar",
                "Lettuce");
//      Via created method "String printBurgerMethod()"
        BurgerWithoutMeat burger3 = new BurgerWithoutMeat("Briosh", "Chedar",
                "Heinz", "Salat");
    }

}
