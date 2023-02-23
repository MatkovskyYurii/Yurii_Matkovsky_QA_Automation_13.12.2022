package com.hiilel.lessons.lesson15Exception.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        /*
        можлива структура
        1. try{
        } catch{
        }

        2. try{
        } finally{
        }

        3. try{
        } catch{
        } finally{
        }

        4.try{
        } catch{
        } catch{
        } catch{
        } finally{
        }

         */
        try { // Блок try туди записують потенційно небезпечний код який може мати помилки
//            після того як ми отримали exception весь наступний код в блоці try не виконується
//            але якщо exception не спрацює то виконується весь код блоку try
            int x = 10 / 0;
//            / мульти-catch(багато кетчів) по ієрархії знизу до верху від child до
//            потрібно їх ставити знизу до верху від child до super див таблицю ExceptionHierarchy
//            так потрібно робити тому що якщо в нас є, наприклад RuntimeException super зверху
//            і після нього ArithmeticException child то в нас exception спрацює в RuntimeException
//            ще до того як дойде до ArithmeticException тому завжди потрібно йти від child до super!
        } catch (ArithmeticException e) { // в () записуємо exception який ми очікуємо і що робити
            System.out.println("ArithmeticException");
        } catch (IllegalArgumentException e) { // це child RuntimeException і тому його можна добавити
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) { // мульти-catch(багато кетчів) по ієрархії знизу до верху від child до
            // батьків super
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally { // може його не бути , він виконується завжди
            // і коли в нас кейс отримали  exception і коли його не було
//            Як зупинити finally
//            1. System.exit(500); в блоці try абщ catch
//            код зупинки finally (500 в дужках ми пишемо самі яку нам помилку потрібно)
            System.out.println("block finally");
        }
        // finally не виконається якщо буде exception саме в ньому finally{ exception }
        // ще кейс потоків і коли є exception в demon то він може потушини main з finally
        System.out.println("Program is still running");
    }

    public void task1(){

    }

    public static IOException getException() throws IOException{
        throw new IOException();
    }
    /*
    throw - викидує exception з методу щось на подобі return ви явно створюєте обєкт exception
    throws - даємо зрозуміти що private static IOException getException() він private і ми не знаємо
    про його реалізацію ми даємо зрозуміти через слово throws IOException що тут є такий exception
     */

    public static int getArithmeticException() throws ArithmeticException{
        int x = 20/0;
        return x;
    }
    /*
    то саме throws ArithmeticException{ в int getArithmeticException()
     */


}
