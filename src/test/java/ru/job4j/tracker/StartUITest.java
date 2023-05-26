package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answer = {"Ernest"};
        Input input = new StubInput(answer);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item excepted = new Item("Ernest");
        assertThat(created.getName()).isEqualTo(excepted.getName());
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Er");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId()), "Ernest"};
        StartUI.editItem(new StubInput(answer), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("Ernest");
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Vor v zakone");
        tracker.add(item);
        boolean delete = tracker.delete(item.getId());
        assertThat(delete).isTrue();
    }
}