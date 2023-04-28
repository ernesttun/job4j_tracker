package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ab, Point bc, Point ac) {
        this.first = ab;
        this.second = bc;
        this.third = ac;
    }

    public double semiPerimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && bc + ac > ab && ab + bc > ac;
    }

    public double area() {
        double rsl = 0;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        } else {
            rsl = -1;
        }
        return rsl;
    }
}
