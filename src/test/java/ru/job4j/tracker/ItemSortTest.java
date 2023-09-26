package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemSortTest {
    @Test
    public void itemAscByName() {
        List<Item> items = Arrays.asList(
                new Item("Ernest"),
                new Item("Ronaldo"),
                new Item("Felix"),
                new Item("Messi")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> excepted = Arrays.asList(
                new Item("Ernest"),
                new Item("Felix"),
                new Item("Messi"),
                new Item("Ronaldo")
        );
        assertThat(excepted).isEqualTo(items);
    }

    @Test
    public void itemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Ernest"),
                new Item("Ronaldo"),
                new Item("Felix"),
                new Item("Messi")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> excepted = Arrays.asList(
                new Item("Ronaldo"),
                new Item("Messi"),
                new Item("Felix"),
                new Item("Ernest")
        );
        assertThat(excepted).isEqualTo(items);
    }
}