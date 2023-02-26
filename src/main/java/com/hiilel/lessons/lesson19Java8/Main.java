package com.hiilel.lessons.lesson19Java8;

import com.hiilel.lessons.lesson19Java8.productmarket.Product;
import com.hiilel.lessons.lesson19Java8.productmarket.ProductMarket;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /**
         * Functional interface - це інтерфейс який має один абстрактний метод без реалізації
         * реалізацію переоприділяємо самостійно в child
         */
        /**
         * Lambdas expressions - short block of code which takes in parameters and return value
         * lambda - приймає тільки Functional interface
         */


//        System.out.println("Hello World");
//
//        List<String> list = List.of(
//                "Hello",
//                "Hello1",
//                "Hello2"
//        );
//      list.forEach(l-> System.out.println(l)) - lambda expression

//        list.forEach(l -> {
//            System.out.println(l + 12); // lambda
//            System.out.println(l);
//        });

//        List<Product> list = new ArrayList<>();
//        list.add(new Product("Mayo", 25));
//        list.add(new Product("Cheese", 2));
//        list.add(new Product("Meat", 29));

//        Collections.sort(list,
////                Comparator.comparing(p->p.getName()));// тут java бачить що ми подаємо list а це означає що p=list
//                //і тоді ми порівнюємо p.list по getName
//                Comparator.comparing(Product::getName));// - це метод reference , візьми з Product , getName та по
////                ньому порівнюй
//        for (Product p : list) {
//            System.out.println(p);
//        } // наступний рядок кращий та простіший запис цього циклу
//        list.forEach(System.out::println);// У методі 1 параметр того ж типу який я подаю в метод

        /**
         * reference - можна використовувати коли
         * list.forEach(System.out::println);// У методі 1 параметр того ж типу який я подаю в метод
         * або метод немає вхідного параметра приклад getName()
         *
         */
//        List<Product> list = List.of(); //  .of() означає на змінна ми створюємо колекцію яку вже не можемо змінити

        List<Product> list = new ArrayList<>();
        list.add(new Product("Mayo", 25));
        list.add(new Product("Cheese", 2));
        list.add(new Product("Meat", 109));

        ProductMarket productMarket = new ProductMarket(list);
        System.out.println(productMarket.getProductPriceLess100());
        System.out.println(productMarket.getProductNames());

//        boolean i = list.stream()
//                .map(Product::getName)
//                .anyMatch(str -> str.startsWith("M"));
//        System.out.println(i);

//        list.stream()
//                .filter(p -> p.getPrice() < 100)            // повертає stream
//                .collect(Collectors.toList());
////                .forEach(System.out::println);

//        Optional                              // клас в який можна посатвити любий об'єкт child Object

//        Optional<Product> product = list.stream() // boxing
//                .filter(p -> p.getPrice() < 90)
//                .findFirst();
//
//        if (product.isPresent()) {
//            System.out.println(product.get().getName()); // product.get() - unboxing
//        }

    }
}
