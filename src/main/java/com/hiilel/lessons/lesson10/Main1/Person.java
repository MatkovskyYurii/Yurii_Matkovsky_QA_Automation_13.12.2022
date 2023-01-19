package com.hiilel.lessons.lesson10.Main1;

public class Person {

    String name; // дефолтне значення null ГЛОБАЛЬНА змінна
    int age; // дефолтне значення 0
//    boolean // дефолтне значення false

//  Перевантаження
    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name,int age,int x) {
        this.name = name;
        System.out.println(x);
    }

//    public Person(String name, int age) { // ніколи не потрібно писати void
//        this.name = name; // this. ключове слово на ініціалізації ГЛОБАЛЬНОЇ змінної name
//        this.age = age; // this для того що значення з Person(String name, int age) покласти в ГЛОБАЛЬНУ змінну
//        System.out.println("Object " + this.name + " Created ");
//    }

    void SayHello(){
        System.out.println(name + " Sayed hello");
    }

    int getAge(){
        return age;
    }
    void increaseAge(){
        age++;
    }

    void demo() {
        String name = "qwerty"; // Локальна змінна
        System.out.println(name);
    }

//      Це оверайт ми зміннюємо стандартний метод на такий як потрібно нам без нього
//    System.out.println(den); // надрукує не значення den а його hashcode преведний до 16...
//    з ним ми отримаємо значення з змінної den

    @Override // це анотація
    public String toString() { // коли ми хочемо надрукувати обьект його можна змінювати для себе
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
