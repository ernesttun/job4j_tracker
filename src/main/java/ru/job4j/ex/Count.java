package ru.job4j.ex;

public class Count {
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int sum = 0;
        for (int i = start; i != finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 10));
    }
}
