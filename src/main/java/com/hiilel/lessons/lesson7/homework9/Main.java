package com.hiilel.lessons.lesson7.homework9;

import java.util.Arrays;

public class Main {
//    Є дві команди регбі з 25 гравців різного віку у кожній.
//
//    Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//    Виведіть у двох рядках вік гравців кожної команди.
//
//    Порахуйте середній вік гравців кожної команди та виведіть на екран.
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int maxAge = 40;
        int minAge = 18;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (maxAge - minAge + 1 ) + minAge);
            team2[i] = (int) (Math.random() * (maxAge - minAge + 1 ) + minAge);
        }
        System.out.println("Team 1 ages: " + Arrays.toString(team1));
        System.out.println("Team 2 ages: " + Arrays.toString(team2));

        int team1TotalAge = 0;
        int team2TotalAge = 0;
        for (int i = 0; i < team1.length; i++) {
            team1TotalAge += team1[i];
            team2TotalAge += team2[i];
        }

        double team1AvgAge = (double) team1TotalAge / 25;
        double team2AvgAge = (double) team2TotalAge / 25;
        System.out.println("Team 1 average age: " + team1AvgAge);
        System.out.println("Team 2 average age: " + team2AvgAge);
    }

}
