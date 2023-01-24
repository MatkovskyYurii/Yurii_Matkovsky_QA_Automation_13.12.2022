package com.hiilel.lessons.lesson11.Homework14;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів
        UserData user1 = new UserData("Yurii", 22, 9, 1997, "email@esadls.com",
                "+38068180486", "Matkovsky", 65, 190, 154237);

        UserData user2 = new UserData("Alex", 11, 5, 2003, "email@esadls.com",
                "+380637190486", "Smith", 105, 120, 13255);

        UserData user3 = new UserData("Oleg", 1, 12, 1975, "email@esadls.com",
                "+380639170486", "Vunnyk", 78, 90, 6567);
        // Данні користувачів через метод printAccountInfo()
        System.out.println(user1.printAccountInfo());
        System.out.println(user2.printAccountInfo());
        System.out.println(user3.printAccountInfo());

        // Заміна даних через Setter + Getter (друк даних які замінили)
        System.out.println("\nBefore changes " + user1.getDaySteps());
        user1.setDaySteps(34321);
        System.out.println("New value " + user1.getDaySteps());

        System.out.println("\nBefore changes " + user2.getPressure());
        user2.setPressure(97);
        System.out.println("New value " + user2.getPressure());

        // Всі данні після заміни
        System.out.println(user1.printAccountInfo());
        System.out.println(user2.printAccountInfo());
        System.out.println(user3.printAccountInfo());


    }
}
