package com.hiilel.lessons.lesson18CompareTo.footballteam;

import com.hiilel.lessons.lesson18CompareTo.comparators.PlayerCompareByAgeComparator;
import com.hiilel.lessons.lesson18CompareTo.comparators.PlayerCompareByNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    /**
    Гараяча клавіша для переміщення рядка shift + option + стрілка вгору/вниз
     */
public class Main {


    public static void main(String[] args) {

        Player p = new Player("Zen", 25);
        Player p1 = new Player("Karl", 22);


        List<Player> list = new ArrayList<>();
        list.add(p);
        list.add(p1);


//        PlayerCompareByAgeComparator playerCompareByAgeComparator1 = new PlayerCompareByAgeComparator();
//        Collections.sort(list,playerCompareByAgeComparator1);


        /**
         *  Collections.sort(list,new PlayerCompareByAgeComparator());
         * тут ми не створюємо PlayerCompareByAgeComparator playerCompareByAgeComparator1 = new PlayerCompareByAgeComparator();
         * нового об'єкта а передаємо анонімний клас "new PlayerCompareByAgeComparator())"
         */

//        Collections.sort(list);
        /**
         * Collections.sort(list); бере наш лист list перезаписує і повертає в
         * List<Player> list = new ArrayList<>();
         */

        for (Player o : list) {
            System.out.println(o);
        }

        /**
         * for each - як працює
         * в нас є така операція
         * for (Player o : list){ - тут ми починаємо цикл об'єкт класу Player це те що в нас зберігається в list
         * довжина list це його кінець і для того щоб оперувати нашими об'єктами ми створюємо зміну "o" -
         * при кожній ітерації в "o" записується посилання на об'єкт Player в листі List
         * це получаються наш індекс для того щоб потім в {} працювати з кожним об'єктом з list окремо
         * for (Player o : list) {
         * System.out.println(o);
         * }
         * Що відбувається під капотом але це не правильно так писати як внизу тільки для розуміння
         * int i = 0;
         * for (Player o : list){
         *      list.get(i)
         *      System.out.println(o);
         *      i++;
         *   }
         */

    }
}
