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
            if (itr.getName().contains(key) || itr.getSurname().contains(key)
                    || itr.getPhone().contains(key) || itr.getAddress().contains(key)) {
                rsl.add(itr);
            }
        }
        return rsl;
    }
}
