package com.hiilel.lessons.lesson4.homework5;

public class Main {
    public static void main(String[] args) {

        // Кількість воїнів династії Лі кожного типу
        int liWarriorCount = 860;

        // Кількість воїнів династії Мінь кожного типу
        double minWarriorCountFactor = 1.5;
        int minWarriorCount = (int) (liWarriorCount * minWarriorCountFactor);

        // Показники атаки воїнів династії Лі кожного типу
        int liWarriorsAttack = 13;
        int liArchersAttack = 24;
        int liCavalryAttack = 46;

        // Показники атаки воїнів династії Мінь кожного типу
        int minWarriorsAttack = 9;
        int minArchersAttack = 35;
        int minCavalryAttack = 12;

        // Загальний показник атаки династії Лі
        int liTotalAtack = liWarriorCount * (liWarriorsAttack + liArchersAttack + liCavalryAttack);
        System.out.println("Значення загальної атаки армії Лі  " + liTotalAtack);

        // Загальний показник атаки династії Мінь
        int minTotalAtack = minWarriorCount * (minWarriorsAttack + minArchersAttack + minCavalryAttack);
        System.out.println("Значення загальної атаки армії Мінь " + minTotalAtack);

        System.out.println();

        // Загальний показник атаки для обох династій
        int totalArmyAtack = liTotalAtack + minTotalAtack;
        System.out.println("Загальний показник атаки для обох династій " + totalArmyAtack);

    }
}
