package com.hiilel.lessons.lesson15Exception.main2;

public class NothingToDivide extends RuntimeException{
    public NothingToDivide(String message) {
        super(message);
    }

    public NothingToDivide(String message, Throwable cause) {
        super(message, cause);
    }
}
