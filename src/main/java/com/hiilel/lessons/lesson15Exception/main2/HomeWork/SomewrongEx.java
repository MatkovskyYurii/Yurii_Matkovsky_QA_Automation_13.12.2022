package com.hiilel.lessons.lesson15Exception.main2.HomeWork;

public class SomewrongEx extends Throwable {
    public SomewrongEx(String message) {
        super(message);
    }

    public SomewrongEx(String message, Throwable cause) {
        super(message, cause);
    }
}
