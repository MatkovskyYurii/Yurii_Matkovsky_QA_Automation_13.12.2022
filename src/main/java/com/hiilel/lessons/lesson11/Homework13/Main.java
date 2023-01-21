package com.hiilel.lessons.lesson11.Homework13;

public class Main {
    public static void main(String[] args) {
        Android samsung_s22 = new Android("Samsung s22");
        samsung_s22.sms();
        samsung_s22.call();
        samsung_s22.internet();
        samsung_s22.method1Linux();
        System.out.println();
        IPhones iphone14 = new IPhones("iPhone 14");
        iphone14.sms();
        iphone14.call();
        iphone14.internet();
        iphone14.method1Ios();
    }

}
