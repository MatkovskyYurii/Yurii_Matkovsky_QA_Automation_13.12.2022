package com.hiilel.lessons.lesson11.StaticPublicETC.qwerty;

import com.hiilel.lessons.lesson11.StaticPublicETC.Student;
// якщо в нас є клас з конструктором то його child клас має повторювати конструктор з super класу Student
// для того щоб мати змогу проініалізувати його змінні
public class StudentChild extends Student {
    public StudentChild(String name, String secondName, int age, double avgPoint) {
//        System.out.println("name"); Завжди першим має йти ініціалізація з суперкласу будьяка дія перед
//        цією ініціалізацією не буде працювати
        super(name, secondName, age, avgPoint);
        System.out.println(this.name);
    }

    public StudentChild(String name, String secondName, int age) {
        super(name, secondName, age);
    }

    public StudentChild(String name, String secondName) {
        super(name, secondName);
    }
    // тут ми можемо використовувати нашу змінну protected name в межах цього класу StudentChild
    void demo (){
        System.out.println(name);
    }
}
