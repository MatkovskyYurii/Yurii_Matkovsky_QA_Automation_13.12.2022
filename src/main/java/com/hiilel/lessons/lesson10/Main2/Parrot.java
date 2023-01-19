package com.hiilel.lessons.lesson10.Main2;

public class Parrot extends  Animal {

    void fly(){
        System.out.println(name + " Fly ");
    }

    @Override // Папуга не вміє бігати run загальна властивість для всіх з Animal яку наслідує папуга
        // щоб було can't run ми перевизначили @Override run для папуги(Parrot)
    void run() {
        System.out.println(name + " Can't run!!!");;
    }
}
