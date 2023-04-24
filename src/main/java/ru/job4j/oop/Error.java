package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printOf() {
        System.out.println("Вирус активирован: " + active);
        System.out.println("Статус вируса: " + status);
        System.out.println("Название: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error er = new Error(true, 1, "Троян");
        Error rootkit = new Error(false, 2, "Руткит");
        Error worm = new Error(true, 3, "Worm");
        error.printOf();
        System.out.println();
        er.printOf();
        System.out.println();
        rootkit.printOf();
        System.out.println();
        worm.printOf();
        System.out.println();
    }
}
