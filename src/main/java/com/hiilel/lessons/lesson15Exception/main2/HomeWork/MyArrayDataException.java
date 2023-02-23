package com.hiilel.lessons.lesson15Exception.main2.HomeWork;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

}
