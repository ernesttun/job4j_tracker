package ru.job4j.poly;

public interface Transport {
    void drive();

    void passenger(int numberOfPassengers);

    int refuel(int fuelQuantity);
}
