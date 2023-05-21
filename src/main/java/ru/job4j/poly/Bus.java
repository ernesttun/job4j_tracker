package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Максимально 60 км/ч");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Вмещает пассажиров " + numberOfPassengers);
    }

    @Override
    public int refuel(int fuelQuantity) {
        int price = 50 * fuelQuantity;
        return price;
    }
}
