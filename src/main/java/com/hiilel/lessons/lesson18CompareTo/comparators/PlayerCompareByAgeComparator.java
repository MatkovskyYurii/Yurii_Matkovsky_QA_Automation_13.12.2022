package com.hiilel.lessons.lesson18CompareTo.comparators;

import com.hiilel.lessons.lesson18CompareTo.footballteam.Player;

import java.util.Comparator;

public class PlayerCompareByAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
