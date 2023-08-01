package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindByNothing() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(
                new Person("Ivan", "Ivanov", "86048", "Stavropol")
        );
        ArrayList<Person> person = phoneDictionary.find("Moscow");
    }
}