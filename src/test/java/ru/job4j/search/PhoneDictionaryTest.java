package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindByNothing() {
        var phoneDictionary = new PhoneDictionary();
        phoneDictionary.add(
                new Person("Ivan", "Ivanov", "86048", "Stavropol")
        );
        var person = phoneDictionary.find("Moscow");
        assertThat(person.isEmpty()).isTrue();
    }
}