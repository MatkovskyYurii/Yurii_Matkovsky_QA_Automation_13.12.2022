package com.hiilel.lessons.lesson11.Homework13;

public class IPhones implements Smartphones,IOS{
    String name;

    public IPhones(String name) {
        this.name = name;
    }
    @Override
    public void call() {
        System.out.println(name + " can call");
    }

    @Override
    public void sms() {
        System.out.println(name + " can send sms");
    }

    @Override
    public void internet() {
        System.out.println(name + " can use internet now ");
    }


    @Override
    public void method1Ios() {
        System.out.println(name + " use iOS ");
    }
}
