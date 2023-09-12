package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("e.tunan11@gmail.com", "Ernest Tyunyan");
        for (String itr : map.keySet()) {
            String value = map.get(itr);
            System.out.println(itr + " = " + value);
        }
    }
}
