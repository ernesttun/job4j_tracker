package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иванов");
        student.setSurName("Иван");
        student.setPatronymic("Иванович");
        student.setGroup(117);
        student.setDate(new Date());

        System.out.println("ФИО: " + student.getName() + " " + student.getSurName()
                + " " + student.getPatronymic() + " has group " + student.getGroup());
    }
}
