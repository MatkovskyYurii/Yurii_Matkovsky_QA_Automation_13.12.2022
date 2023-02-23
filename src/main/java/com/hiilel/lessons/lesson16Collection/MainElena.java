package com.hiilel.lessons.lesson16Collection;

import com.hiilel.lessons.lesson12.shop.Beer;

import java.util.HashSet;
import java.util.Set;

public class MainElena {
    public static void main(String[] args) throws InterruptedException {

//        equals - метод потрібно переопреділяти в класах, якщо він не перепопредельон то він порівнює по силці
//        якщо hashcode 1=1 і обєкти equals=equals тобто однаковий в двох об'єктів то ми не створимо
//        два об'єкти а просто замінимо останнім з тим самим hashcode

        Beer beer = new Beer(500, "Cool", "Ukraine", 2.2, "Dark");
        Beer beer1 = new Beer(600, "Cool", "Ukraine", 2.2, "Dark1");
        Beer beer2 = new Beer(800, "Cool", "Ukraine", 2.2, "Dark2");


        Set<Beer> beers = new HashSet<>();
        beers.add(beer2);
        beers.add(beer);
        beers.add(beer1);

        for (Beer b : beers) {
            System.out.println(b.toString());
        }


    }
}
