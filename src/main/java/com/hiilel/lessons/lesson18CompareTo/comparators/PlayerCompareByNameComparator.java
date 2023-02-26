package com.hiilel.lessons.lesson18CompareTo.comparators;

import com.hiilel.lessons.lesson18CompareTo.footballteam.Player;

import java.util.Comparator;

public class PlayerCompareByNameComparator implements Comparator<Player> {
    /**
     Comparator<Player> - вказуємо <Player> це тип об'єкта який ми порівнюємо
     */
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
