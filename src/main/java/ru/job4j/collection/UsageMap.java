package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("e.tunan11@gmail.com", "Ernest Tyunyan");
        map.put("e.tun@gmail.com", "Ernest");
        map.put("e.q@mail.ru", "Er");
        map.put("e.tunan11@gmail.com", "Nest");
        for (String itr : map.keySet()) {
            String value = map.get(itr);
            System.out.println(itr + " = " + value);
        }
    }
}
