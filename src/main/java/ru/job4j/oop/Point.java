package ru.job4j.oop;

public class Point {
    private int x;

    private int y;

    public Point(int first, int third) {
        this.x = first;
        this.y = third;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}
