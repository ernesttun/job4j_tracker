package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split("");
        String[] text = duplicateText.split("");
        HashSet<String> check = new HashSet<>();
        for(String itr : origin) {
            check.add(itr);
        }
        for (String itr : text) {
            rsl = check.contains(itr);
            break;
        }
        return rsl;
    }
}
