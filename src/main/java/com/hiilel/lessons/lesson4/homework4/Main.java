package com.hiilel.lessons.lesson4.homework4;

public class Main {
    public static void main(String[] args) {

        // Створення трьох змінних для зберігання сторін паралелепіпеда
        int side1 = 10;
        int side2 = 20;
        int side3 = 30;

        // Розрахунок об'єму паралелепіпеда у змінній volume
        int volume = side1 * side2 * side3;

        // Виведення обсягу на екран
        System.out.println("Об'єм паралелепіпеда = " + volume);

        // Розрахунок сумарної довжини всіх сторін у змінній length
        int length = side1 + side2 + side3;

        // Виведення сумарної довжини на екран
        System.out.println("Сумарна довжина сторін = " + length);

    }
}
