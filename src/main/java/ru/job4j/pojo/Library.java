package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 524);
        Book grokAlgorithms = new Book("Grok algorithms", 288);
        Book headFirstJava = new Book("Head First Java", 717);
        Book warAndPeace = new Book("War and Peace", 1300);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = grokAlgorithms;
        books[2] = headFirstJava;
        books[3] = warAndPeace;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " has pages " + bk.getNumberOfPages());
        }

        System.out.println("Replace 0 to 3");
        books[0] = warAndPeace;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " has pages " + bk.getNumberOfPages());
        }

    System.out.println("Shown only book.name.equals(Clean code)");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " has pages " + bk.getNumberOfPages());
            }
        }
    }
}
