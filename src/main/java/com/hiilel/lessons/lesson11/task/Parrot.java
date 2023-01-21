package com.hiilel.lessons.lesson11.task;

public class Parrot implements Participant {

    String name;

    public Parrot(String name) {
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
