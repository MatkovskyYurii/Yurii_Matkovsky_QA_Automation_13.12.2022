package com.hiilel.lessons.lesson5.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st team Name ");

        String nameFirstTeam = scanner.nextLine();
        System.out.println("1st team name: " + nameFirstTeam);

        System.out.println("Please enter frags for 1st Player: ");

        int firstPlayerTeamOne = 0;
        if (scanner.hasNextInt()) {
            firstPlayerTeamOne = scanner.nextInt();
            System.out.println("Player 1 = " + firstPlayerTeamOne);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 2nd Player: ");

        int secondPlayerTeamOne = 0;
        if (scanner.hasNextInt()) {
            secondPlayerTeamOne = scanner.nextInt();
            System.out.println("Player 2 = " + secondPlayerTeamOne);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 3rd Player: ");

        int thirdPlayerTeamOne = 0;
        if (scanner.hasNextInt()) {
            thirdPlayerTeamOne = scanner.nextInt();
            System.out.println("Player 3 = " + thirdPlayerTeamOne);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 4th Player:  ");

        int fourthPlayerTeamOne = 0;
        if (scanner.hasNextInt()) {
            fourthPlayerTeamOne = scanner.nextInt();
            System.out.println("Player 4 = " + fourthPlayerTeamOne);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 5th Player: ");

        int fifthPlayerTeamOne = 0;
        if (scanner.hasNextInt()) {
            fifthPlayerTeamOne = scanner.nextInt();
            System.out.println("Player 5 = " + fifthPlayerTeamOne);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);

        }
        scanner.nextLine();

        System.out.println("Please enter second team Name ");

        String nameSecondTeam = scanner.nextLine();
        System.out.println("2nd team name: " + nameSecondTeam);

        System.out.println("Please enter frags for 1st Player: ");

        int firstPlayerTeamTwo = 0;
        if (scanner.hasNextInt()) {
            firstPlayerTeamTwo = scanner.nextInt();
            System.out.println("Player 1 = " + firstPlayerTeamTwo);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 2nd Player: ");

        int secondPlayerTeamTwo = 0;
        if (scanner.hasNextInt()) {
            secondPlayerTeamTwo = scanner.nextInt();
            System.out.println("Player 2 = " + secondPlayerTeamTwo);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 3rd Player: ");

        int thirdPlayerTeamTwo = 0;
        if (scanner.hasNextInt()) {
            thirdPlayerTeamTwo = scanner.nextInt();
            System.out.println("Player 3 = " + thirdPlayerTeamTwo);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 4th Player:  ");

        int fourthPlayerTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fourthPlayerTeamTwo = scanner.nextInt();
            System.out.println("Player 4 = " + fourthPlayerTeamTwo);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter frags for 5th Player: ");

        int fifthPlayerTeamTwo = 0;
        if (scanner.hasNextInt()) {
            fifthPlayerTeamTwo = scanner.nextInt();
            System.out.println("Player 5 = " + fifthPlayerTeamTwo);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }
        System.out.println();
        System.out.println("Results:");

        double avg = 5.0;

        int avgTeamOne = (int) ((firstPlayerTeamOne + secondPlayerTeamOne + thirdPlayerTeamOne
                + fourthPlayerTeamOne + fifthPlayerTeamOne) / avg);
        int avgTeamTwo = (int) ((firstPlayerTeamTwo + secondPlayerTeamTwo + thirdPlayerTeamTwo
                + fourthPlayerTeamTwo + fifthPlayerTeamTwo) / avg);

        System.out.println("AVG Team "+ nameFirstTeam + " = " + avgTeamOne);
        System.out.println("AVG Team "+ nameSecondTeam + " = " + avgTeamTwo);

        int teamOnemSumm = (firstPlayerTeamOne + secondPlayerTeamOne + thirdPlayerTeamOne
                + fourthPlayerTeamOne + fifthPlayerTeamOne);
        int teamTwoSumm =(firstPlayerTeamTwo + secondPlayerTeamTwo + thirdPlayerTeamTwo
                + fourthPlayerTeamTwo + fifthPlayerTeamTwo);

        System.out.println("Team summ "+ nameFirstTeam + " = " + teamOnemSumm);
        System.out.println("Team summ "+ nameSecondTeam + " = " + teamTwoSumm);

        if (teamOnemSumm > teamTwoSumm) {
            System.out.println("Перемогла команда " + nameFirstTeam + " набрала "+ teamOnemSumm +" очків");
        } else if (teamTwoSumm > teamOnemSumm){
            System.out.println("Перемогла команда " + nameSecondTeam + " набрала "+ teamTwoSumm +" очків");
        } else {
            System.out.println("Рахунок рівний перемогла дружба =) ");
        }

    }



    }
