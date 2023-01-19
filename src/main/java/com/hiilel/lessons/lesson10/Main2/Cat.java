package com.hiilel.lessons.lesson10.Main2;

public class Cat extends Animal { // extends - розширяємо , далі клас який ми наслідуємо тільки 1 клас
    // можемо наслідувати

    void jump(){
        System.out.println(name + " jump");// змінна name відсутня в класі Cat але так як Cat наслідує клас Animal
        // в якому є name ми можемо користуватись name і також в класі Cat
    }
}
