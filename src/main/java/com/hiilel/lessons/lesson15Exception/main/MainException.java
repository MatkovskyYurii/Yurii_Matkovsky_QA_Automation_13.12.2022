package com.hiilel.lessons.lesson15Exception.main;

import java.io.IOException;

public class MainException {
    public static void main(String[] args) {
    getNumber();
    }

    public static void getException() throws IOException {
        throw new IOException();
    }

    public static int getNumber() {
        try {
            System.out.println("1");
            getException();
            return 1;
        } catch (IOException e) {
            System.out.println("1");
            return 2;
        } finally {
            return 5;
        }
        // finaly return має перевагу над всіма тому тут буде не return 2; а  finally return 5;
    }
}
