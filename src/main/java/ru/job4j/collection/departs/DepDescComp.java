package ru.job4j.collection.departs;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] one = o1.split("/");
        String[] two = o2.split("/");
        if (two[0].compareTo(one[0]) == 0) {
            return o1.compareTo(o2);
        }
        return two[0].compareTo(one[0]);
    }
}
