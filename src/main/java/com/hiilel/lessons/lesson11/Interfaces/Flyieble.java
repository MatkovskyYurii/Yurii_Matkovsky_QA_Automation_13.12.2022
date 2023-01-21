package com.hiilel.lessons.lesson11.Interfaces;

public interface Flyieble {

    int DISTANCE = 100; // це властивість яка буде на рівні ВСЬОГО інтерфейсу, а не одного об'єкту
    // всі змінні які створюються в інтерфейсі автоматично є public static final
    // ніколи не зможемо змінити значення
    void fly();

}
