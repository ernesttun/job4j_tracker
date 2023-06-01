package ru.job4j.ex;

public class Fact {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less than 0");
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
