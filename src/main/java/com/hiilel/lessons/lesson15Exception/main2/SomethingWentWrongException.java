package com.hiilel.lessons.lesson15Exception.main2;

public class SomethingWentWrongException extends RuntimeException{
    public SomethingWentWrongException(String message) {
        super(message);
    }

    public SomethingWentWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
