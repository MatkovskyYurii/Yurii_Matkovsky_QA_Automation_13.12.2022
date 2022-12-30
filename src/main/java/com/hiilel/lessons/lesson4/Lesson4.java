package com.hiilel.lessons.lesson4;

public class Lesson4 {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 3;

////        System.out.println(5 + 10);
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//
//        System.out.println((double) a / b);
//        System.out.println(a / (double)b);
//        System.out.println((double) a /(double) b);
////        щоб не втрачати числа після крапки в діленні потрібно перевести в змінну double
//
//        System.out.println(10 % 2); // 5 * 2 = 10. 10 - 10 = 0
//        System.out.println(10 % 3); // 3 * 3 = 9. 10 - 9 = 1
//        System.out.println(10 % 4); // 2 * 4 = 8. 10 - 8 = 2
//        System.out.println(10 % 5); // 2 * 5 = 10. 10 - 10 = 0
//        System.out.println(10 % 6); // 1 * 6 = 6. 10 - 6 = 4
//        System.out.println(10 % 7); // 1 * 7 = 7. 10 - 7 = 3
//        System.out.println(10 % 8); // 1 * 8 = 8. 10 - 8 = 2
//        System.out.println(10 % 9); // 1 * 9 = 9. 10 - 9 = 1

//        int c = 10;
//        int d = 3;
//
//        c = c + 5;
//        System.out.println(c);
//        c += 5 ;
//        System.out.println(c);
//        c -= 5 ;
//        System.out.println(c);
//        c /= 5 ;
//        System.out.println(c);
//        c %= 5  ;
//        System.out.println(c);
//
//        System.out.println(c + d * c - d); // 10 * 3 - 3 + 10 = 37
//        System.out.println((c + d) * c - d); // (10 + 3) * 10 - 3 = 127
//        System.out.println((c + d) * (c - d)); // (10 +3) * ( 10 - 3) = 13 * 7 = 91

//        int a = 10;
//        a = a + 1;
//        a += 1;
        // операція інкременту завжди +1 зміна тільки на 1 не можна писати a+2
//        a++;
//        a++;
//        a++;
//        a++;
        // декремент
//        a--;
//        a--;
//        a--;
//        System.out.println(a);

//        System.out.println("before a = " +a);
//        System.out.println(10 + a++); // якщо так він зробить 10 + 10 = 20 але a = 10 +1
//        System.out.println(10 + ++a); як так то буде 21 він зробит 10 + 1+10 = 21 a = 10 +1
//        System.out.println("after a = " +a);

//        int a = 10;
//        int b = 3;
//                          10 + 3 - 11
//        System.out.println(a++ + b++ - a--); // перше число візьме 10 і додасть в змінну +1 і треттє число буде брати з нової змінної 11; 10 +3 -11 =2
//        System.out.println("a = " + a );
//        System.out.println("b = " + b );

//        System.out.println(--a + b++ + ++b - a++); // 9 + 3 + 5 - 9 = 17 - 9 = 8
//        System.out.println(a);// 10
//        System.out.println(b);//
//
//        int a = 10;
//        int b = 3;
//
//        System.out.println(--a * (a++ + --b)+ b--); // 9 * ( 9 + 2) + 2 = 101 декременти йдуть по чергово а тоді вже йдуть математичні операції
//
//        System.out.println(a);// 10
//        System.out.println(b);// 1
//
//        System.out.println((int) 10.7);
//        System.out.println(Math.round(10.7));
//        System.out.println(Math.round(10.4));
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));

////        System.out.println(Math.max(10, 11));
//        // from 0 to 0.9999999999
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        System.out.println(Math.random());
//        // from 0 to 10
//        // 0 * 10 = min 0
//        // 0.9999999 * 10 = max 10,99999 якщо касутємо до int (10)
//        System.out.println(Math.random()*11);
//        // якщо нам треба число int то ми кастуємо так
//        System.out.println((int) (Math.random()*11)); // якщо буде без дужок він візьме з рандома 0.99999 тільки 0

//        int min = 15 ;
//        int max = 30 ;
//        //from 15 to 30 ; 15 + int (0.9999 * (30-15+1)) = Random
//        System.out.println(min + (int) (Math.random()*(max-min+1)));


        //Task 1
//        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

        int junior = 500 ;
        int middle = 1500 ;
        int senior = 3500 ;
        int countFactorYears = 10 * 12;

        // 1. Зарпалата за 10 років
        int juniorsumm10 = junior * countFactorYears;
        int middlesumm10 = middle * countFactorYears;
        int seniorsumm10 = senior * countFactorYears;
        System.out.println("1. Зарпалата за 10 років джун = " +juniorsumm10);
        System.out.println("1.1 Зарпалата за 10 років мідл = " +middlesumm10);
        System.out.println("1.2 Зарпалата за 10 років сеньйор = " +seniorsumm10);

        // 2. Відняти 5% податку
        double countFactorTax = 0.95;
        int juniorAfterTaxes = (int) (juniorsumm10 * countFactorTax);
        int middleAfterTaxes = (int) (middlesumm10 * countFactorTax);
        int seniorAfterTaxes = (int) (seniorsumm10 * countFactorTax);
        System.out.println("2. Після сплати 5% податку джун = " + juniorAfterTaxes);
        System.out.println("2.1 Після сплати 5% податку мідл = " + middleAfterTaxes);
        System.out.println("2.2 Після сплати 5% податку сеньйор = " + seniorAfterTaxes);

        // 3. Порахувати середнє арифметичне за трьома сумами за 10 років
        double avg = 3.0;
        int avgAllempoyesWithouTax = (int) ((juniorsumm10 + middlesumm10 + seniorsumm10) / avg);
        System.out.println("3. Порахувати середнє арифметичне за трьома сумами за 10 років = " +avgAllempoyesWithouTax);

        // 3. Порахувати середнє арифметичне за трьома сумами за 10 років
        int avgAllempoyesAfterTax = (int) ((juniorAfterTaxes + middleAfterTaxes + seniorAfterTaxes) / avg);
        System.out.println("4. Вивести суми зарплат за 10 років з урахуванням вирахування податків та середнє арифм = "
                + avgAllempoyesAfterTax);


    }
}
