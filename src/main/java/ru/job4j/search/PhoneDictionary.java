package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<>();
        for (Person itr : person) {
            if (key.contains(itr.getName()) || key.contains(itr.getSurname())
                    || key.contains(itr.getPhone()) || key.contains(itr.getAddress())) {
                rsl.add(itr);
            }
        }
        return rsl;
    }
}
