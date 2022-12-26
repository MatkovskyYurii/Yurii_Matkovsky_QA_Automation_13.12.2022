package com.hiilel.lessons.lesson2;

public class Main {
    // клас завжди пишемо з великої літери
    public static void main(String[] args) {

        byte byVariable;
        // byte - цу тип
        // byVariable - цe змінна назву ми дали самостійно (починається з маленької літери)

        byVariable=-128;
        System.out.println(byVariable);

        byVariable=101;
        System.out.println(byVariable);

        byVariable=102;
        System.out.println(byVariable);

        short shortVariable = 12112;

        int intVariable = 1212121;

        long longVariable = 12321313213L;

        float floatVariable = 1.123456789F;

        double doubleVariable = 1.12345678910111213;

        System.out.println();
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

        System.out.println();
        char charVariable1 = 'A';
        char charVariable2 = 65;
        char charVariable3 = '\u0041';
        // char бере данні по коду з таблиці або 1 буква або число з таблиці
        System.out.println(charVariable1);
        System.out.println(charVariable2);
        System.out.println(charVariable3);
        System.out.println();

        boolean boleanTrue = true;
        boolean boleanFalse = false;

        System.out.println(boleanTrue);
        System.out.println(boleanFalse);
        System.out.println();

        String str = "Hello";
        String str2 = "Hello";
        String str3 = "Hello";
        // ми сторили ячейку в String Pool якій дали значення Hello в пам'яті Stack кожен раз коли ми будемо
        // створювати таке саме значеня Hello (str2/str3) він буде брати його з (str) а не створювати нове.Тільки для String
        String str4 = new String("Hello");
        //new string створює в heap пам'яті

        System.out.println(str);
        System.out.println(str2);
        System.out.println();

        // внизу приклади явного приведення типів в інші типи  (auto cast)

        byte byte1 = 127;
        short short1 = byte1;
        System.out.println(short1);
        // ми перетворили тип значення short1 в byte1

        char charA = 'A';
        int intA = charA;
        System.out.println(intA);
        // ми перетворили тип значення intA в charA

        int age = 28;
        double doubleAge = age;
        System.out.println(doubleAge);
        // ми перетворили тип значення double в int age

        byte byte2 = 127;
        int int2 = byte2;
        System.out.println(int2);
        // ми перетворили тип значення byte byte2 в int int2 перепригнули short
        // у зворотньому порядку не можна приводити! потрібно кастування
        System.out.println();

        // Кастування примусове приведення типу для значення нашої змінної
        int x = 10;
        byte y = (byte) x;
        // тут відбулось кастування - перетворення з типу int в тип byte
        System.out.println(x);
        System.out.println(y);
        System.out.println();

        int x1 = 130;
        byte y1 = (byte) x1;
        // число 130 за межами діапазону byte (-128/+127) java виконує формулу 130-127=3 і бере третє за порядком число
        // від'ємного діапазону byte -128 це перше число,-127 друге тому відповідь буде -126 третє число діапазону -128/+127
        System.out.println(x1);
        System.out.println(y1);
        System.out.println();

        int x2 = -130;
        byte y2 = (byte) x2;
        // число -130 за межами діапазону byte (-128/+127) java виконує формулу -130-128=2 і бере друге за порядком
        // число діапазону byte з додатьної сторони 127 це перше число, 128 друге тому відповідь буде 129 третє число
        System.out.println(x2);
        System.out.println(y2);
        System.out.println();
        // якщо вказати 5000 тоді він порахує 5000 -127-127-127-127-127...(по колу йде)
        // (це будуть переповнення і результат буде з діапазону) 32, а не 4968
        // в такому випадку ми втрачаємо наше число 5000 і якщо навіть ми повернемо назад byte після кастування
        // в int ми НЕ отримаємо більше число 5000, а результат буде 32

        final double YURII = 22;
        // double YURII = 25;
        // Приклад константа - це число яке ми задали з додаванням final і більше ми не зможемо його змінити в іншому місці
        // Константа завжди у верхньому регістрі  більше одного слова "_" приклад (YURII_MATKOVSKY_VOLODIA)
        // Math.PI
        // зверху можна нажати на PI (comand+click) і в нас будуть приклади готових констант Java code convention



    }
}
