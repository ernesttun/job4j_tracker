package ru.job4j.cast;

public class Fly implements Vehicle {
    @Override
    public void moves() {
        System.out.println(getClass().getSimpleName() + " летает по воздуху");
    }
}
