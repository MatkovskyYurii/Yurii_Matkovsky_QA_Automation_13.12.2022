package com.hiilel.lessons.lesson11.Homework13;

public class Android implements Smartphones,LinuxOS{
    String name;

    public Android(String name) {
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
    public void method1Linux() {
        System.out.println(name + " use LinuxOS ");
    }
}
