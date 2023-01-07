package com.hiilel.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //        FOR

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА; працює лише 1 раз та завжди перший
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ; має бути bolean
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }

//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//        }

//        System.out.println();

//        код щоб можна було використовувати змінну за межами умови if
//        int b;
//        for (b = 1; b <= 10; b += 5) {
//            System.out.println(b);
//        }
//        System.out.println(b);

        // можна ще так використувати (не дуже правильно) краще заміни d += 6
//        int d;
//        for (d = 1; d <= 20; d += 5) {
//            System.out.println(d);
//            d++;
//        }
//        System.out.println(d);

        // якщо пусто по замовчуванню буде true
//        int d;
//        for (d = 1; ; d += 5) {
//            System.out.println(d);
//        }


//        // Безкінечний цикл
//        for (int d = 1; true; d += 5){
//            System.out.println(d);
//        }
//
//        int i = 0;
//        for ( ; ; ){
//
//            if (i == 10){
//                break;
//            }
//
//            i++;
//
//            if (i == 5 || i == 7){
//                continue;
//            }
//
//            System.out.println(i);
//        }

//        int i;
//        for (i = 1; i <= 10; i++) {
//            if (i == 5 || i == 7){
//                continue;
//            }
//            System.out.println(i);
//        }


//                -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20
//
//        for (int i = 0; i <=20 ; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 20 ; i++) {
//            if (i % 2 != 0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum = 0;
//
//        System.out.print(number1 + " " + number2 + " " );
//
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            System.out.print(sum + " ");
//            number1 = number2;
//            number2 = sum;
//        }

//        // можна код писати без дужок {} але тоді ігнорується тільки перший рядок якщо умова не підходить
//        // то робить один радок по умові а всі інші без умови
//
//        int a = 5;
//        int b = 7;
//
//        if (a < b)
//            System.out.println("yes");
//        System.out.println("yes");

        //while (БЛОК УМОВИ ВИХОДУ З ЦИКЛУ) {....} bolean

//        int i = 1;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }
//
//        int i = 1;
//        while (true) {
//            if (i == 11){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }

        // Перше щось зробили і потім на false закінчили
        // навіть якщо умова перша умова false він її зробить а потім зупиниться

//        int i = 20;
//        do {
//            System.out.println(i);
//        }while (i < 10 );

//        int uservalue = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) { // тут ми створюємо цикл
//            System.out.println("Please enter integer");
//            if (scanner.hasNextInt()) {
//                uservalue = scanner.nextInt();
//                System.out.println("user value " + uservalue);
//                break; // тут ми повинні закінчити цикл якщо умова true виконанна
//            } else {
//                System.out.println("wrong data");
//                scanner.nextLine(); // тут відбувається зачищення буфера щоб не було зациклення в неправильній
//                // відповіді false
//            }

//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win

//        int i = 10;
//
//        while (i >= 0) {
//            System.out.println(i);
//            int random = (int) (Math.random() * 101);
//
//            System.out.println("random number " + random);
//            if (random >= 85 && random <= 100){
//                System.out.println("WIIIN!!");
//                break;
//            }
//
//            if (i == 0){
//                System.out.println("BOOOOM!");
//            }
//
//            i--;
//
//        }


//        2)
//        Обчислити факторіал числа від 1 до N (вводимо з консолі) (1 - 10)
//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;
//
//        Scanner scanner = new Scanner(System.in);
//        int numFactorial = -1;
//        while (true) {
//            System.out.println("Pleae enter num from 1 to 10 ");
//            if (scanner.hasNextInt()) {
//                numFactorial = scanner.nextInt();
//                if (numFactorial >= 1 && numFactorial <= 10 ) {
//                    break;
//                }else {
//                    System.out.println("за межами діапазону " + numFactorial);
//                }
//            }else {
//                System.out.println("Wrong data");
//                scanner.nextLine();
//            }
//        }
//
//        //        5! = 1 * 2 * 3 * 4 * 5;
//
//        int result = 1;
//        for (int i = 1; i <= numFactorial ; i++) {
//         result *= i;
//        }
//
//        System.out.println("Result = " + result);

            //        3) Homework
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

//        1 2 3 5 6 7 8 10 11 12 13 15 16 17 18
//
//        int counter = 0;
//        for (int i = 10; i <= 100; i++) {
//            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 | i % 10 == 9) {
//                continue;
//            }
//            System.out.println(i);
//            counter++;
//        }
//
//        System.out.println("counter = " + counter);

//        34

//        System.out.println(34 / 10);
//        System.out.println(34 % 10);


        }


    }


