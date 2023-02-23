package com.hiilel.lessons.lesson15Exception.main2.HomeWork;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
