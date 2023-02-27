package com.hiilel.lessons.lesson20String;

public class Main {
    /**
     * String s2 = "Top" +"Java"; тут створюється 3 об'єкти
     * 1 = "Top"
     * 2 = "Java"
     * 3 "Top" + "Java" = "TopJava" після конкатенації створюється 3 стрінг якщо такого немає
     * ЯКЩО в нас є інший String s1 = "TopJava" тоді 3 стрінг не створюються а посилається на String s1 в String Pool
     * Через таке створення та посилання об'єктів на об'єкти String рахується immutable - тобто не змінний
     * String s3 = new String("TopJava") - new String("TopJava") це створення стрінга через конструктор
     * в HEAP пам'яті навіть якщо вони equals ( не в String pool)
     * String - це по факту масив character(char)(символ)
     * public final class String - final заборона наслідування і розширення
     *
     * Методи
     * String str = "Hello";
     * .length - ( довжина к-ть ЗНАЧЕНИЙ тому що це масив символів char ) Значений означає що є 5 букв і він поверне 5
     * НЕ ПЛУТАТИ з індексом масиву тому що індекс починається від 0 і буде = 4!
     *
     * .concat - це конкатенація те сам String s2 = "Top" +"Java"
     * String str = "Hello";
     * str.concat = ("world"); - тут не правильно тому що ми маємо присвоїти значення і потрібно писати
     * String str3 = str.concat = ("world"); тоді все виконається ок
     *
     * String Format
     * %f -добавить flat без потреби писати "String" + 10.0000 + "String"; = можна написати "String %f String", 10d;
     * %d -добавить int без потреби писати "String" + 5 + "String"; = можна написати "String %f String", 5;
     * %s -добавить String без потреби писати "String" +"Yurii"+ "String"; = можна написати "String %f String","Yurii";
     * String fs;
     * fs = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", 45d, 10, "MyString");
     *         System.out.println(fs);
     * System.out.println(fs);
     *
     * char check = str.charAt(int index) - дістає індекс символа
     * int check = str.compareTO(Object o) - порівнює String str з іншими об'єктами
     * boolean check = str.startsWith("he") - починається з
     * boolean check = str.endWith("lo") - закінчується на
     * boolean check = str.equals("hello") - порівнює значення String str і String "hello" важливий регістр hello = тільки hello
     * порівнює char по byte code 71=103? з таблиці кодів символів
     * boolean check = str.equalsIgnoreCase("hello") - порівнює значення String str і String "hello" hello = Hello/hello
     * char check = str.indexOf('h') - получити індекс символу h пишеться через одинарні скобки '' бо символ char
     *
     * String str = "120$"
     * String str2 = str.replace('$','') = тут ми викинули $ з str і отримаємо просто 120
     * int x = Integer.valueOf(str2); тут буде помилка numberFormat exception тому що після replace str2 = "120  "
     * int x = Integer.valueOf(str2.trim()); тут ми викликаємо str2.trim() який обрізає всі пробіли спереду і заду, будь-де
     * і ми отримаємо тільки те що хотіли "120"
     * Split
     * String text = "Fifa wil never regret it"
     * String[] words = text.split(" "); тут ми кожне слово переносим в окремий масив , слова розділяються по (" ")
     * тобто пробіл
     * for (String word : words){
     *     System.out.println(word);
     * }
     *
     * StringBuffer та StringBuilder
     * StringBuilder - не потоко безопасний
     * StringBuffer - потоко безопасний
     * по суті це ми string обертаємо в StringBuffer(string) boxing на подобі int->Integer
     * це дозволяє нам працювати із string не створюючи нові об'єкти в heap (дуже подібно до колекції)
     * якщо в нас str1+str2=Str3 - ми створили 3 об'єкти то через StringBuffer буде тільки 1 об'єкт Str3
     * .append = "+" або concat тобто добавляє він через str.append
     * .delete - видалити
     * .insert - вставити на який індекс
     */


    public static void main(String[] args) {



    }

}
