package com.hiilel.lessons.Homework14;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("lapa",2,4);
        cat1.setAge(1);
        // Друкую Age, щоб перевірити
        System.out.println("Age " + cat1.getAge());
        cat1.setWeight(10);
        // Друкую weight, щоб перевірити
        System.out.println("Weight " + cat1.getWeight());
        cat1.setName("Lapka");
        // Друкую name, щоб перевірити
        System.out.println("Name: " + cat1.getName());
    }
}
