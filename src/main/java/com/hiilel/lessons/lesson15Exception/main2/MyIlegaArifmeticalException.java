package com.hiilel.lessons.lesson15Exception.main2;

public class MyIlegaArifmeticalException extends Exception {

    public MyIlegaArifmeticalException(String message) {
        super(message);
    }

    public MyIlegaArifmeticalException(String message, Throwable cause) {
        super(message, cause);
    }
}
