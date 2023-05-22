package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void moves() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам");
    }
}
