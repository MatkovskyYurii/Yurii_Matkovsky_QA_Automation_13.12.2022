package com.hiilel.lessons.lesson7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        // це масив можна поставити тільки те значення яке вказано int = тільки int
//        int[] array = new int[5]; // добавляємо new завжди щоб створити пам'ять починається з 0
//        // тому завжди менше на 1 від значення new int [5] = 0 1 2 3 4
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
////
////        System.out.println(array[0]);
////        System.out.println(array[1]);
////        System.out.println(array[2]);
////        System.out.println(array[3]);
//
//        int[] array2 = {1, 2 , 3 , 4 , 5 , 6 }; // це той самий масив просто правильне скороченне написання
//        int[] array3 = new int[]{ 1 , 2 , 3 , 4, 5 , 6 , 7};
//
//        System.out.println(array.length); // array.lenght дізнатись довжину масиива (скільки є комірок)
//        System.out.println(array2.length);
//        System.out.println(array3.length);

//        int[] array = new int[-5]; // не можливо створити від'ємний масив
//
//        int[] array = new int[0]; // можна створити 0
//        System.out.println(array.length);
//        array[0] = 10; // в 0 масив не можливо нічого покласти // ArrayIndexOutOfBoundsException це помилка
//        // яка вказує що ми вийшли за довжину масиву

//
//        int[] array = new int[5];
////
////        array[0] = 1;
////        array[1] = 2;
////        array[2] = 3;
////        array[3] = 4;
////        array[4] = 5;
////        System.out.println(array);// покаже тільки де воно знаходиться в heap
//
//        for (int i = 0; i < array.length; i++) { // заповнення масиву циклом
//            array[i] = i +1;
//        }
////
////        for (int i = 0; i < array.length ; i++) { // завжди знак <
////            System.out.println(array[i]);
////        }
//
//        System.out.println(Arrays.toString(array));

//
//        int[] array = null; // пустий масив
//        System.out.println(array.length); // NullPointerException помилка яка вказує що там нічого немає


//        int[] array = {1, 2 , 3 , 4 , 5 };
//
//        for (int valueName : array) { // з ліва нова зміна які зберігає наш масив з права масив не важливий індекс комірки
//            System.out.println(valueName);
//        }
//
//        // робота з конкретною умовю в конкретній ячейці
//        System.out.println("Before");
//        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] == 3) {
//                array[i] = 99;
//            }
//        }
//            System.out.println("After");
//            System.out.println(Arrays.toString(array));
//
//        int[] array = {1, 2 , 3 , 4 , 6};
//
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//        System.out.println("sum = " + sum);
//        double avg = (double) sum / array.length;
//        System.out.println("Avg = " + avg);
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > avg ){
//                array[i] = 77;
//            }
//        }
//        System.out.println(Arrays.toString(array));


//        int[] array = {-1, 45 , 66 , -57 , 9 , 34 , 99 , 23, 54, 67, 8};
//
////        int min = Integer.MAX_VALUE;// найменше можливе значення в діапазонні int
////        int max = Integer.MIN_VALUE;// найбільше можливе значення в діапазонні int
//
//        int min = array[0];
//        int max = array[0];
//
//        for (int value : array) {
////            if (value < min){
////                min = value;
////            }
////            if (value > max){
////                max = value;
////            }
//
//            min = Math.min(min , value);
//            max = Math.max(max , value);
//
//        }
//        System.out.println("min value = " + min);
//        System.out.println("max value = " + max);

//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому
//
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//        for (int i = 0; i < array.length; i++) {
////            if  (array.length - 1 == i) {
////                System.out.println(array[i]);
////            } else {
////                System.out.print(array[i] + ", ");
////            }
//
//            System.out.print(array[i] +((array.length -1 == i)? "" : ", "));
//        }
//
        // Копіювання масива НЕ ПРАВИЛЬНЕ та ПРАВИЛЬНЕ
        int[] array1 = {1 , 2, 3 ,4 ,5 };
//        BAD version
//        int[] array2 = array1;
//
//        System.out.println("array 1 " +Arrays.toString(array1));
//        System.out.println("array 2 " +Arrays.toString(array2));
//
//        array2[0] = 99;
//
//        System.out.println();
//        System.out.println("array 1 " +Arrays.toString(array1));
//        System.out.println("array 2 " +Arrays.toString(array2));
        // Good version
//        int[] array2 = new int[array1.length];
//
//        System.out.println("array 1 " +Arrays.toString(array1));
//        System.out.println("array 2 " +Arrays.toString(array2));
//
//        for (int i = 0; i < array1.length ; i++) {
//            array2[i] = array1[i];
//        }
//        array2[0] = 99;
//        System.out.println("array 1 " +Arrays.toString(array1));
//        System.out.println("array 2 " +Arrays.toString(array2));
//
//

    }
}
