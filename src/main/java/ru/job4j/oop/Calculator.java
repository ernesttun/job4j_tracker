package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return a + x;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + minus(d) + divide(d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = sum(5);
        System.out.println("Результат метода sum " + a);
        a = calculator.multiply(5);
        System.out.println("Результат метода multiply " + a);
        a = minus(5);
        System.out.println("Результат метода minus " + a);
        a = calculator.divide(5);
        System.out.println("Результат метода divide " + a);
        a = calculator.sumAllOperation(5);
        System.out.println("Результат метода sumAllOperation " + a);
    }
}
