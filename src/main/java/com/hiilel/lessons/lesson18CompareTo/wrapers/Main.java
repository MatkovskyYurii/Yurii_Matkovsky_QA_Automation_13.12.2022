package com.hiilel.lessons.lesson18CompareTo.wrapers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * wrapper - обгортка
     * boxing - int k = 10;
     * Int i = new Int(k);        коли ви простий тип передаєте через силочний
     * unboxing - int x = i.getValue();      тут дістаємо з силочного простий тип
     */

    public static void main(String[] args) {
        int b = 10;
        Integer i = b;

        List<Integer> list = new ArrayList<>();
        list.add(i);

        for (Integer i1 : list
        ) {
            System.out.println(i1);
        }


        /**
         * MAP
         * Map - отдельная иерархия не iterable!
         * Map - put добавити значення
         * Map - Entry = key + value
         * key can be null once / unique
         * value / non unique
         */


        int k = 0;
        Map<String, String> map = new HashMap<>();
        map.put("Key", "value");
        map.put(null, "value");
        System.out.println(map.get("Key"));



//        for (Map.Entry<String, String> kl : map.entrySet()) {
//            System.out.println(kl.getKey() + " " + kl.getValue());
//        }

    }
}
