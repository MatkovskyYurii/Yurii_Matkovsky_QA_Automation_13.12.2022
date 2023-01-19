package com.hiilel.lessons.lesson10.Main1;

import com.hiilel.lessons.lesson10.Main1.Person;

public class Main {
    public static void main(String[] args) {

        Person den = new Person("Denis",28, 5);

        System.out.println(den); // надрукує не значення den а його hashcode преведний до 16...

//        den.age = 28;
//        den.name = "Denis";
//
//        System.out.println(den.name);
//        System.out.println(den.getAge());
//
//
//        den.SayHello();
//
//        System.out.println();
//        System.out.println();

//        Person alex = new Person("Alex",33);

//        alex.age = 33;
//        alex.name = "Alex";
//
//        System.out.println(alex.name);
//        System.out.println(alex.getAge());
//
//        alex.SayHello();



    }
}
