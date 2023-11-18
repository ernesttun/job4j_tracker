package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {
    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> rsl = new ArrayList<>();
        pred = (str -> str.getSize() > 100 || str.getName().contains("bug"));
        for (Folder folder : list) {
            if (pred.test(folder)) {
                rsl.add(folder);
            }
        }
        return rsl;
    }
}
