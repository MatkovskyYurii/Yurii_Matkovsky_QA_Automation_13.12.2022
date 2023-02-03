package com.hiilel.lessons.lesson12.shop;

import com.hiilel.lessons.lesson12.abstraction.BottleProduct;
import com.hiilel.lessons.lesson12.interfaces.Bubbling;

public class Beer extends BottleProduct implements Bubbling {

    private String beerType;

    public Beer(int volume, String design, String manufacturer, double grade, String beerType) {
        super(volume, design, manufacturer, grade);
        this.beerType = beerType;
    }

    @Override
    public String getDescription() { // Переоприделине 1
        return "Beer: " + getDesign() + " ,with type: " + beerType;
    }

    @Override
    public void bubbling() {
        System.out.println("Beer: " + beerType + " піниться");
    }
    // Переопредиление модифікатор доступу розширяється, а значення яке повертаємо звужується

//    public String getDescription(int k) { // Перегрузка 1
//        return "Beer: " + getDesign() + " ,with type: " + beerType + k;
//    }
//    public String getDescription(double k) { // Перегрузка 2...
//        return "Beer: " + getDesign() + " ,with type: " + beerType + k;
//    }

}
