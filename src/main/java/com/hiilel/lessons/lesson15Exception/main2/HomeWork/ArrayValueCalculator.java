package com.hiilel.lessons.lesson15Exception.main2.HomeWork;

public class ArrayValueCalculator {

    public int doCalc(String[][] values) {
        checkArraySize(values);
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Incorrect data in cell " + i + " row " + j +
                            " Expected a number but found something else.", e);
                }
            }
        }

        return sum;
    }

    private void checkArraySize(String[][] values) {
        checkArraySize(values.length);

        for (int i = 0; i < values.length; i++) {
            checkArraySize(values[i].length);
        }
    }

    private void checkArraySize(int length) {
        if (length != 4) {
            throw new MyArraySizeException("Size must be 4x4");
        }
    }
}
