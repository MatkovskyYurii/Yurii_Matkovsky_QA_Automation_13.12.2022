package com.hiilel.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Integer[] array = {1, 5, -2, 99, 7, -7, 44, -55, 65};
//
//        System.out.println("before sort:" + Arrays.toString(array));
//        int counter = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("after sort:" + Arrays.toString(array));
//
//        System.out.println("counter = " + counter);

        // сортування масива через клас
//        Arrays.sort(array);
//        System.out.println("sort: " + Arrays.toString(array));


//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println("sort: " + Arrays.toString(array));

        // Бінарний пошук - можливий тільки після того коли масив відсортований
//        Arrays.sort(array);
//        System.out.println("sort: " + Arrays.toString(array));
//        Arrays.binarySearch(array, 99);
//        System.out.println("BinarySearch номер комірки : " + Arrays.binarySearch(array, 99));


//        int[][] array = new int[3][4];
//
//        array[0][0] = 77;
//        array[0][1] = 2;
//        array[0][2] = 5;
//        array[0][3] = 6;
//        array[1][0] = 7;
//        array[1][1] = 6;
//        array[1][2] = 10;
//        array[1][3] = 13;
//        array[2][0] = 11;
//        array[2][1] = 5;
//        array[2][2] = 3;
//        array[2][3] = 4;
//
//        System.out.println(Arrays.deepToString(array));
        // У двох вимірному масиві new int[3][4] array.length = першому числу кількості рядків [3]

//        int [][] array = {
//                {77 ,2 ,5 ,6},
//                {7 ,6 ,10 ,13},
//                {11 ,5 ,3 ,4}
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j]+ "\t");
//            }
//            System.out.println();
//        }
//        int [][] array = {
//                {11 ,1 ,1 ,1,1,1,1,1},
//                {77 ,2 ,5 ,6},
//                {7 ,6 },
//                {},
//                {11 ,1 ,1 ,1,1,1,1,1}
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]+ "\t");
//            }
//            System.out.println();
//        }
//
        // табуляція коду command + option + L

// Створити масив розміром 5x5. Заповнити масив за допомогою циклу таким
// чином, щоб одиниця у кожному рядку зміщувалась вправо:

//      1 0 0 0 0       // 0 0
//      0 1 0 0 0       // 1 1
//      0 0 1 0 0       // 2 2
//      0 0 0 1 0       // 3 3
//      0 0 0 0 1       // 4 4

//      0 0 0 0 1       // 0 4
//      0 0 0 1 0       // 1 3
//      0 0 1 0 0       // 2 2
//      0 1 0 0 0       // 3 1
//      1 0 0 0 0       // 4 0

        // version 1
        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
        // version 2
//        for (int i = 0; i < array.length ; i++) {
//            array[i][i] = 1;
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j]+ "\t");
//            }
//            System.out.println();
//        }

        // version 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j]+ "\t");
//            }
//            System.out.println();
//        }
////

        // version 2
//        for (int i = 0, j = array.length - 1; i < array.length ; i++ , j--) {
//        if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//        }

        // version 3
//        for (int i = 0; i < array.length ; i++) {
//            array[i][array.length - 1 - i] = 1;
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//                System.out.print(array[i][j]+ "\t");
//            }
//            System.out.println();
//        }

    }
}
