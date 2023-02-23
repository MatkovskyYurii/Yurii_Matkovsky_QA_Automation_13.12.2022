package com.hiilel.lessons.lesson16Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        Collection - це інтерфейс який зв'язує в собі подібні класи для реалізації структур даних
//      Щось на подобі масивів даних, але з більшими можливостями
//      Map - те саме що Collection тільки індекси можуть бути не тільки числові 00 01 11 а якісь значення
//        ArrayList<Integer> numbers = new ArrayList<>(); // розмір такого масиву динамічно змінюється якщо в () пусто
        // якщо (5) то розмір 5 , він дуже тяжкий для програми тому що займає багато пам'яті
        // назвафункції.команда наприклад numbers.add numbers.get numbers.set і тд
//        numbers.add(5);
//        numbers.add(5);

//        System.out.println(numbers.get(1));
        // добавити в конкретний index в дужках добавляємо (індекс потім , значення) (1,50)
//        numbers.add(1,50);
        // numbers.remove(індекс який очищаємо)
        // numbers.clear видалити все
//        System.out.println(numbers.size());
//        for (Integer el : numbers) { // тут ми створюємо змінну "el" яка замінює нам індекс і можемо вивести Має мати
            // той самий тип що наш List
//            System.out.println(el);
//        }

        // LinkedList масив в який буде постійно видаляти або добавляти індексування відбувається не через масив
        // а прив'язка до попереднього
//        LinkedList<Float> mumbers= new LinkedList<>();
//        mumbers.add(231F);
//        mumbers.add(221f);
//        mumbers.add(22f);
//        mumbers.add(31F);
        // методи всі ті самі get remove clear set

        /*
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello 1");
        list.add("Hello 2");
        list.add("Hello 3");
        // тут ми робимо цикл змінної i від ArrayList list  і в середеину кладемо умову якщо наш зміна-індекс i має l
        // тоді роби це
        for (String i : list) {
        if (i.contains("l")){
            System.out.println(i);
        }
        */


    }
}

