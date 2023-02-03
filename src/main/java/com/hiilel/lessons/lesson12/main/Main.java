package com.hiilel.lessons.lesson12.main;

import com.hiilel.lessons.lesson12.enams.ColorOfWine;
import com.hiilel.lessons.lesson12.shop.Whiskey;
import com.hiilel.lessons.lesson12.shop.Wine;

public class Main {
    public static void main(String[] args) {

//        Whiskey whiskey = new Whiskey(1,"Super","Ukraine",2,9,"English");
//        whiskey.calculateGrade();
//        System.out.println(whiskey.getGrade());

        Wine wine = new Wine(1,"Super","Ukraine",14,ColorOfWine.RED);
        System.out.println(wine);
        System.out.println(wine.getDescription());
    }
}
