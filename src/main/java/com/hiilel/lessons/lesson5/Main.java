package com.hiilel.lessons.lesson5;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 5;
//
//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
//
//        boolean isBigger = a > b;
//
//        System.out.println(isBigger);

//        boolean boleanTrue = false;
//        // !- це інверсія
//        System.out.println(!boleanTrue);

//        int a = 5;
//        int b = 5;
//        if (a > b) {
//            System.out.println("a > b");
//        }
//        if (a > b){
//            System.out.println("a > b");
//        } else {
//            System.out.println("a <= b");
//        }
//        if (a > b){
//            System.out.println("a > b");
//        }
//        if (a < b){
//            System.out.println("a < b");
//        }
//        if (a > b){
//            System.out.println("a == b");
//        }
//        if (a > b){
//            System.out.println("a > b");
//        } else if (a < b ) {
//            System.out.println("a < b");
//        } else if (a < b ){
//            System.out.println("a == b");
//        }

//        if (a > b){
//            System.out.println("a > b");
//        } else if (a < b ) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a == b");
//        }

//        int a = 2;
//        int b = 2;
//        int c = 3;
//        Логічний оператор АБО = OR "||" виконує завжди з двох сторін
//        a > b - true
//        b < c - false
//        if (a < b || b > c){
//            System.out.println("Hello");
//        }
////        AND "І" виконує тільки до FALSE і зупиняєстья або два TRUE
//        if (a < b && b > c){
//            System.out.println("Hello");
//        }

//        if (a >= b){
//            System.out.println("a >= b");
//            if (a <= b) {
//                System.out.println("a == b");
//            } else {
//                System.out.println("a > b");
//            }
//        }else {
//            System.out.println("a < b");
//        }

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
////        System.out.println(a > b || b++ ==c);
////        System.out.println(a > b && ++b ==c);
//        System.out.println(a < b && ++b ==c && b++ != c);
//
//        System.out.println("b = " + b);
//        int a = 1;
//        int b = 2;
//
//        if (a > b){
//            System.out.println("Yes");
//        } else {
//            System.out.println("NO");
//        }
//        // Тернарний оператор
//        // (умова) ? вираз1 : вираз 2 ;
//        System.out.println( (a > b) ? "Yes" : "No" );

//        int a = 3;
//        if (a == 1 ){
//            System.out.println("do some thing 1");
//        } else if (a == 2 ) {
//            System.out.println("do some thing 2");
//        }else if (a == 3 ) {
//            System.out.println("do some thing 3");
//        }else if (a == 4 ) {
//            System.out.println("do some thing 4");
//        }else if (a == 5 ) {
//            System.out.println("do some thing 5");
//        }

//        Switch case
//        Ключове слово braek якщо його не ставити, то коли switch отримає cas 3 = true
//        код буде дальше виконуватись вниз кейс 3 і весь код всіх нижніх кейсів до кінця або слова break
//        deafult виконується якщо жодна умова не підійшла може бути будь-де, але треба тоді ставити break
//        int a = 3;
//        switch (a) {
//            case 1 : {
//                System.out.println("do some thing 1");
//            }
//            case 2 : {
//                System.out.println("do some thing 2");
//                break;
//            }
//            case 3 : {
//                System.out.println("do some thing 3");
//                break;
//            }
//            case 4 : {
//                System.out.println("do some thing 4");
//
//            }
//            case 5 : {
//                System.out.println("do some thing 5");
//                break;
//            }
//            default: {
//                System.out.println("do default");
//                break;
//            }
//        }

//        String str = "QWERTY";
////        Референсні типи порівнюються через equals ( порівняння самого значення )
//        System.out.println(str.equals("QWERTY"));
////        Ігнорувати регістер Q=q
//        System.out.println(str.equalsIgnoreCase("QWERTY"));
//
//
//        switch (str){
//            case "QWERT" :{
//                System.out.println("1");
//            }break;
//            case "QWER" :{
//                System.out.println("2");
//            }break;
//            case "QWERTY" :{
//                System.out.println("3");
//            }break;
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter integer ");
//        int value = scanner.nextInt();
//
//        System.out.println("value = " + value);
//        String next = scanner.nextLine();
//        System.out.println("next = " + next);
//
//        String next2 = scanner.nextLine();
//        System.out.println("next2 = " + next2);

//
//        int бере значення до \n тому якщо нам потрібно дальше стрінг потрібно очистити \n з буфера
//        scanner.nextLine(); - очищення буфера ми зчитуємо, але нікуди його просто не записуємо
//
//        System.out.println("Please enter integer ");
//        int value = scanner.nextInt();
//        System.out.println("value = " + value);
//        scanner.nextLine();
//
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

//        Для перевірки що в нас ВЖЕ Є в буфері або що користувач введе в буфер використовують .hasNextInt()
//        if (scanner.hasNextInt()){
//            int value = scanner.nextInt();
//            System.out.println("value = " + value);
//        } else {
//            System.out.println("Wrong data!");
//            System.exit(0);
//        }







    }
}
