package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void moves() {
        System.out.println(getClass().getSimpleName() + " передвигается по рельсам");
    }
}
