package com.hiilel.lessons.lesson10.Main2;

public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.name = "Bobik";

        Cat cat = new Cat();
        cat.name = "Barsik";

        dog.run(); // dog в своєму об'єкті має додаткову властивість happy в методі run
        dog.swim();


        cat.run();
        cat.jump();

        Parrot parrot = new Parrot();
        parrot.name = "Kesha";
        parrot.run(); // Папуга не вміє бігати run загальна властивість для всіх з Animal
        // щоб було can't run ми перевизначили @Override run для папуги(Parrot)

    }
}
