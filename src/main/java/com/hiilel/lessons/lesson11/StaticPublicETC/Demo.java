package com.hiilel.lessons.lesson11.StaticPublicETC;

import com.hiilel.lessons.lesson11.StaticPublicETC.Student;

public class Demo {
    static void printVariable(){ // це статтичний метод який ми можемо викликати без створення об'єкту
        System.out.println(Student.counter);
        Student.counter = 5;
    }
}
