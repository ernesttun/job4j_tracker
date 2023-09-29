package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int min = Math.min(left.length(), right.length());
        int charRsl;
        for (int i = 0; i < min; i++) {
            char leftChar = left.charAt(i);
            char rightChar = right.charAt(i);
            charRsl = Character.compare(leftChar, rightChar);
            if (charRsl != 0) {
                return charRsl;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
