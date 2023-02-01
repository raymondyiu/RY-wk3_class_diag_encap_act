package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ray", 'B', 3);
        System.out.println(student.getDetail());
        student.upgrade();
        System.out.println(student.getDetail());
        student.upgrade();
        System.out.println(student.getDetail());
        student.downgrade();
        student.downgrade();
        System.out.println(student.getDetail());
    }
}