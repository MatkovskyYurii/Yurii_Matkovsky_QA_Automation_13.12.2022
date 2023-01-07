package com.hiilel.lessons.lesson6.homework7;

import java.util.Scanner;

public class Main {

//    Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//    Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

    public static void main(String[] args) {

        int random = (int) (Math.random() * 11);
        int userValue = -1;
        int i = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("I'm thinking of a number between 0 and 10. Can you guess it?");


        for (i = 1; i <= 3; i++) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                if (userValue == random) {
                    System.out.print("Congratulations, you guessed the right number!");
                    scanner.hasNextInt();
                    break;
                }
                if (userValue > random) {
                    System.out.println("Your value is too big ");
                } else {
                    System.out.println("Your value is too small ");
                }
            } else {
                System.out.println("Wrong data must be integer! ");
                scanner.hasNextInt();
                break;
            }
        }
        if (userValue != random) {
            System.out.println();
            System.out.println("Attempts have ended. Please start a new game.");
        }
    }
}

