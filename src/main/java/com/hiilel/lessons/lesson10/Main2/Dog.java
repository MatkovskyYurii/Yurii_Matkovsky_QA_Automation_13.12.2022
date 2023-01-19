package com.hiilel.lessons.lesson10.Main2;

public class Dog extends Animal {  // extends - розширяємо , далі клас який ми наслідуємо
    // Dog - subclass or child ;  Animal superclass or parent

    void swim(){
        System.out.println(name + " swim"); // змінна name відсутня в класі Dog але так як Dog наслідує клас Animal
        // в якому є name ми можемо користуватись name і також в класі Dog
    }

    @Override // якщо нам підходить базова реалізація  наприклад методу run але ми хочемо ще щось додати своє до неї
        // тут ми до методу run добавляємо нову властивість happy
    void run() {
        super.run();// базова реалізація super - це посилання до super класу Animal
        System.out.println(name + " happy!!!");
    }
}
