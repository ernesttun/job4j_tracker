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
}