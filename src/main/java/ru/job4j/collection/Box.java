package ru.job4j.collection;

public class Box {
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    public static void num(int x) {
        System.out.println("Значение типа int: " + x);
    }

    public static void main(String[] args) {
        Integer g = 250;
        Integer h = 250;
        System.out.println(g == h);

        Integer v = 125;
        Integer w = 125;
        System.out.println(v == w);
        int m = 2;
        num(m);
    }
}
