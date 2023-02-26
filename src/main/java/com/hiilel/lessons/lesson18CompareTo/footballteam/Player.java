package com.hiilel.lessons.lesson18CompareTo.footballteam;
/**
 *
 * Compare - це оператор порівняння який повертає int -1 тобто < менше, 0 тобто == рівно, 1 тобто > більше
 * внизу ми порівнюємо по String name
 * подаєш об'єкт і вибираєш по якому полю порівнювати
 * обмеження Compare - тільки по одному полі
 * наприклад
 * return name.compareTo(o.getName()) && age.compareTo(o.getAge()) - так не працює
 * ПОТРІБНО створювати декілька компараторів самостійно приклад "PlayerCompareByNameComparator" по name та
 * "PlayerCompareByAgeComparator" по age
 */

public class Player implements Comparable<Player>{
    private String name;

    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Player o) {
        return name.compareTo(o.getName());
    }
}
