package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav ");
        gav.eat(" Gav eats a cutlet");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black ");
        black.eat("Black eats a fish");
        black.show();
    }
}
