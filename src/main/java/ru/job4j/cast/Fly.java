package ru.job4j.cast;

public class Fly implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по воздуху");
    }
}
