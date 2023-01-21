package com.hiilel.lessons.lesson11.Interfaces;
// інтерфейс Flyieble,Runnable типу новий функціонал який може мати Parrot обовзяково потрібна реалізація
public class Parrot extends Animal implements Flyieble,Runnable{ // extends 1 раз тільки implements скільки завгодно
    // разів через кому

    @Override
    public void fly() {
        System.out.println(name + " fly ");
    }

    @Override
    public void run() {
        System.out.println(name + " can't run");
    }
}
