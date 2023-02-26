package com.hiilel.lessons.lesson19Java8.productmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Mayo", 25));
        list.add(new Product("Cheese", 2));
        list.add(new Product("Meat", 29));



//        Collections.sort(list,
//                Comparator.comparing(Product::getName));
//
//        list.forEach(System.out::println);

    }
}
