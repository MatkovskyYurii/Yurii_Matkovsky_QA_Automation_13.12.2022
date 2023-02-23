package com.hiilel.lessons.lesson15Exception.main2;

import com.hiilel.lessons.lesson15Exception.main2.Math;
import com.hiilel.lessons.lesson15Exception.main2.MyIlegaArifmeticalException;
import com.hiilel.lessons.lesson15Exception.main2.NothingToDivide;
import com.hiilel.lessons.lesson15Exception.main2.SomethingWentWrongException;

public class Main2 {
    public static void main(String[] args) {

//        doFinallyBlockDemo();
        doDivisionByZeroDemo2();
    }

    static void doDivisionByZeroDemo() {
        System.out.println(Math.divide(1D, 0D));
        try {
            System.out.println(Math.divide(10, 0));
        } catch (MyIlegaArifmeticalException ex) {
            // try той самий
            System.out.println("Catch Exception here ");
            throw new SomethingWentWrongException("Something went wrong during Math Arf operation", ex);// throw
            // конструктор на попередню помилку для того щоб був stack trace
        }
        System.out.println("END");
    }

    // декілька exception але ми їх обробляємо однаково (try)
    static void doDivisionByZeroDemo2() {
        try {
            System.out.println(Math.divide(0, 0));
        } catch (MyIlegaArifmeticalException | NothingToDivide ex) { // через | добавляєм також 2 помилку якщо
            // try той самий
            System.out.println("Catch Exception here ");
            throw new SomethingWentWrongException("Something went wrong during Math Arf operation", ex);// throw
            // конструктор на попередню помилку для того щоб був stack trace
        }
        System.out.println("END");
    }

    static void doDivisionByZeroDemo3() {
        try {
            System.out.println(Math.divide(10, 0));
        } catch (MyIlegaArifmeticalException ex) {
            System.out.println("Catch Exception here ");
            throw new SomethingWentWrongException("Something went wrong during Math Arf operation", ex);
        } catch (NothingToDivide ex) {
            throw new IllegalArgumentException("Something went wrong during Math Arf operation", ex);
        }
        System.out.println("END");
    }

    // Ієрархія
    // чому не правильно ставити просто exception - тому що сюди будуть попадати любі exception і код буде виконуватись
    // не тільки для тих які ми хотіли обробляти, а для всіх !
    // catch (Exception ex) відкриває доступ для всіх exception - не правильно краще йти по ієрархії
    // якщо внас декілька try і ми зверху даємо батька то не правильно має юути син тому що буе помилка компіляції
    // якщо батько зверху ми ніколи не зайдемо до сина
    static void doDivisionByZeroDemo4() {
        try {
            System.out.println(Math.divide(0, 0));
        } catch (Exception ex) {
            System.out.println("Catch Exception here ");
            throw new SomethingWentWrongException("Something went wrong during Math Arf operation", ex);
        }
        System.out.println("END");
    }

    static void doFinallyBlockDemo() {
        try {
            System.out.println(Math.divide(10, 0));
        } catch (MyIlegaArifmeticalException ex) {
            throw new SomethingWentWrongException("Something went wrong during Math Arf operation", ex);
        } catch (NothingToDivide ex) {
            throw new IllegalArgumentException("Something went wrong during Math Arf operation", ex);
        } finally {
            System.out.println("END");
        }
    }


    static void doStackOverFlowException() {
        int[] values = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3,};
    }

    static void causeStackOverFlow(int[] values) {
        causeStackOverFlow(values);
    }
}
