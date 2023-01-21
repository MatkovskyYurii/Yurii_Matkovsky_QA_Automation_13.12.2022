package com.hiilel.lessons.lesson11.task;

public class Dog implements Participant{

    String name;

    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void swim(){
        System.out.println(name + " swimming...");
    }
    @Override
    public void jump(){
        System.out.println(name + " jumping...");
    }
}
