package ru.job4j.queue;

import ru.job4j.oop.Point;

public record Task(Position position,
                   String description,
                   int urgency) {
}
