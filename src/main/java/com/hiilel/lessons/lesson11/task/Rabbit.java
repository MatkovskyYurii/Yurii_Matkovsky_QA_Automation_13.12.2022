package com.hiilel.lessons.lesson11.task;

public class Rabbit implements Participant{
    String name;

    public Rabbit(String name) {
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
