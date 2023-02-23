package com.max.current.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *  MIN Search Complexity: O(1) Constant
 *  MAX Search Complexity: O(N) Linear
 *  N = наприклад колекція із 10000 об'єктів буде O(1000)
 *  MIN Add Complexity: O(1) Constant
 *
 */

public class Main {
    public static void main(String[] args) {

        doArrayListDemoThree();

    }

    static void doArrayListDemoThree() {
        List<Integer> digits = new ArrayList<>();

        digits.add(1);
        digits.add(-10);
        digits.add(null);
        digits.add(274);
        digits.add(null);
        digits.add(1);

        System.out.println("Contains -10? " + digits.contains(-10));
        System.out.println("Contains -10? " + digits.contains(-111));


    }


    // створення arraylist через батька List
    static void doArrayListDemoOne() {
        List<Integer> inbound = List.of(1, 2, 4);
        List<Integer> digits = new ArrayList<>(inbound);

        digits.add(1);
        digits.add(-10);
        digits.add(null);
        digits.add(274);
        digits.add(null);
        digits.add(1);

        System.out.println("Size: " + digits.size());


        for (int i = 0; i < digits.size(); i++) {
            System.out.println("Val " + digits.get(i));
        }
    }


}
