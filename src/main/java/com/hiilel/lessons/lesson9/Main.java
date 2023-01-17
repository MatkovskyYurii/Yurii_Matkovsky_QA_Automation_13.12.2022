package com.hiilel.lessons.lesson9;

public class Main {
    public static void main(String[] args) {

//        printHelloworld();
//        printHello("Yurii"); // захаркоджено
//        String str = "Yurii";
//        printHello(str); // приймає стрінг який ми створили в main приходить тільки значення
        // якщо створити змінну name яка вже використовується в іншому методі, це дві різні змінні
        // значення будуть братись в конкретній змінній з конкретного методу
//        String name = "Den";
//        printHello(name);
//        System.out.println("Name " + name); // ось тут ми отримаємо завжди Name Den не залежно що ми робимо в іншому
//        // методі
//
//        int x = 5;
//        demo(x);
//        System.out.println("After method " + x);
//        demo(10); // x: не потрібно писати це підказа idea тільки число 10 передаємо
//        demo2(25,1,2,45); // command + P підказка щоб дізнатись яку змінну ти зараз вводиш

//        getSum(10,5); // тут тільки викли і значення ми втрачаємо
//        int result = getSum(5,6); // тут ми змінну result ініціалізуємо викликом метода і результат методу
//        // буде присвоєний змінній result = 11
//        System.out.println("Result = " + result);
//        System.out.println("Result = " + getSum(10,12));

//        printSomething(getSum(10,12)); // аргументом в методі буде виклик іншого методу для того щоб
        // не створювати змінну int result = getSum(5,6);
        // printSomething = int ОБОВ'ЯЗКОВО метод getSum(10,12) = int також інакше буде помилка і аргумент не спрацює

//        runApp();// з методів можна викликати інші методи без проблем

        // пам'ять Stack працює за прикладом Last In First Out як магазин в автоматі АК-47 ми кладемо кулі
        // від першої знизу до останньої вверх,
        // а стріляємо від останньої зверху до першої внизу
        // тобто куля яку поклали останньою вистрілює першою
        // куля яку поклали першою стріляє останньою

        // overload це коли в нас може бути різна к-сть параметрів в одному методі
        // ми створюємо декілька методів які називається однаково, але з різною к-тю параметрів  getSum (приклад)
        //
//        System.out.println(getSum(2, 5));
//        System.out.println(getSum(2, 5, 3));
//        System.out.println(getSum(2, 5, 4, 5));
//        System.out.println(getSum(2, 5, 5, 6, 4));
//        System.out.println(getSum(11.2, 5));
        // якщо ми сторимо метод який має однакові вхідні параметри

//        !5 = 120;
//        int n = 5;
//        int result = 1;
//        for (int i = 1; i <=n ; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//        demoRecursion(5);
        System.out.println(getFactorial(5));

    }
    static int getFactorial (int n){
        if (n == 1){
            return 1;
        }
        return n * getFactorial(n -1);
    }



    static void demoRecursion (int n){
        if (n > 0) {
            System.out.println(n);
            demoRecursion(--n);
        }
    }

//    static int getSum(double a, int b){ // якщо ми сторимо метод який має однакові вхідні параметри
//        // інші значення нічого не буде працювати тому що java не знає який метод ми викликаємо
//        return (int) (a + b);
//    }
//    static double getSum(double a, int b){ // якщо ми сторимо метод який має однакові вхідні параметри але навіть
//        // інші значення нічого не буде працювати тому що java не знає який метод ми викликаємо
//        return  a + b ;
//    }

//    static double getSum(double a, int b){
//        return  a + b ;
//    }
//
//    static void runApp(){
//        runApp2(); //виклик іншого методу в методі
//    }
//    static void runApp2(){
//        int sum = getSum(5,6);
//        printSomething(getSum(10,12)); //виклик іншого методу в методі
//    }

    static int getSum(int a, int b){
//        int sum = a + b;
//        return sum; // return має мати той самий тип який вказаний в методі або тип який можна закастувати до того
        // який вказаний в методі
        return  a + b ;
    }
    static int getSum(int a, int b, int c){
//        int sum = a + b;
//        return sum; // return має мати той самий тип який вказаний в методі або тип який можна закастувати до того
        // який вказаний в методі
//        return  a + b + c ;
        return  getSum(a, b, 0); // так теж можна робити коли нам потрібно щоб метод пройшов, а в нас тільки 2
        // параметри і ми за замовчуванням ставиом 0
    }
    static int getSum(int a, int b,int c, int d){
//        int sum = a + b;
//        return sum; // return має мати той самий тип який вказаний в методі або тип який можна закастувати до того
        // який вказаний в методі
//        return  a + b + c + d ;
        return getSum(a, b, c, d, 0);// так теж можна робити коли нам потрібно щоб метод пройшов, а в нас тільки 2
        // параметри і ми за замовчуванням ставиом 0
    }
    static int getSum(int a, int b,int c, int d, int e){
//        int sum = a + b;
//        return sum; // return має мати той самий тип який вказаний в методі або тип який можна закастувати до того
        // який вказаний в методі
        return  a + b + c + d + e ;
    }
    static void printSomething(int value){
        System.out.println(value);
    }

    static void printHelloworld(){ // void метод який виконується і ми від нього нічого не очікуємо
        System.out.println("Hello World");
    }
    static void printHello(String name){
        System.out.println("Hello " + name);
    }

    static void demo(int x){
        x = 10;
        System.out.println(x);
    }

    static void demo2(int x, int y , int k,int z){
        System.out.println(x);
    }

}