package com.hiilel.lessons.lesson12.shop;

import com.hiilel.lessons.lesson12.abstraction.BottleProduct;
import com.hiilel.lessons.lesson12.enams.ColorOfWine;

public class Wine extends BottleProduct { // всі силочні типи наслідуються від класу object

    private ColorOfWine color; // Агрегація поле color тип якого ColorOfWine
//    Enum - список статичних об'єктів

    public Wine(int volume, String design, String manufacturer, double grade, ColorOfWine color) {
        super(volume, design, manufacturer, grade);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Wine: " + getDesign() + ", with type: " + color.getColor();
    }

//    public void setColor(String color) {
//        if (color.equals("Red") || color.equals("red") || // equals - ми порівнюємо поля об'єкту
//                color.equals("White") || color.equals("white") ||
//                color.equals("Rose") || color.equals("rose")) {
//        this.color = color;
//        }
//    }


    @Override
    public String toString() {
        return "Wine {" +
                " volume=" + getVolume() +
                ", design='" + getDesign() +
                ", manufacturer='" + getManufacturer() +
                ", grade=" + getGrade() +
                " color=" + color.toString() +
                '}';
    }
}
