package org.example;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Ray", Grade.B, Group.four);
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