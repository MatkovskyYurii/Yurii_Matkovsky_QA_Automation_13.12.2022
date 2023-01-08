package com.hiilel.lessons.lesson6.homework8;

public class Main {
//    У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів
//    для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
//    Напишіть функцію, яка виводить усі номери таких шатлів.
//    1 2 3 5 6 7 8 9 10 11
public static void main(String[] args) {

    int counter = 1;
    int i = 1;
    while (true) {
        if (i == 4 || i == 9 || i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9
                || (i % 100) / 10 == 4 || (i % 100) / 10 == 9) {
            i++;
            continue;
        }
        System.out.println(i);
        if (counter == 100) {
            break;
        }
        counter++;
        i++;
    }
    System.out.println("Counter = " + counter);

}

}
