package com.hiilel.lessons.lesson12.shop;

import com.hiilel.lessons.lesson12.abstraction.BottleProduct;
import com.hiilel.lessons.lesson12.interfaces.Bubbling;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return Objects.equals(beerType, beer.beerType) && Objects.equals(getVolume(), beer.getVolume()) &&
        Objects.equals(getDesign(), beer.getDesign());
    }

    @Override
    public int hashCode() {
//        return Objects.hash(beerType);
        return 1;
    }

    @Override
    protected void finalize()  {
        System.out.println("Object is deleted ");
    }

    @Override
    public String toString() {
        return "Beer{" +
                "beerType='" + beerType + '\'' +
                '}';
    }
// Переопредиление модифікатор доступу розширяється, а значення яке повертаємо звужується

//    public String getDescription(int k) { // Перегрузка 1
//        return "Beer: " + getDesign() + " ,with type: " + beerType + k;
//    }
//    public String getDescription(double k) { // Перегрузка 2...
//        return "Beer: " + getDesign() + " ,with type: " + beerType + k;
//    }

}
