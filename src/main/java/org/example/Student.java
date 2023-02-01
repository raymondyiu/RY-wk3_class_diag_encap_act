package org.example;

import java.util.Arrays;
import java.util.List;

public class Student {

    public List<Character> GradeList = Arrays.asList( 'A', 'B', 'C', 'D', 'E', 'F');
    public List<Integer> Grouplist = Arrays.asList(1,2,3,4,5);
    public String name;
    public char grade;
    public int group;
    private String secretNickName;

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void upgrade(){
        switch (grade) {
            case 'A':
                break;
            case 'B':
                grade = 'A';
                break;
            case 'C':
                grade = 'B';
                break;
            case 'D':
                grade = 'C';
                break;
            case 'E':
                grade = 'D';
                break;
            case 'F':
                grade = 'E';
        }
    }

    public void downgrade(){
        switch (grade) {
            case 'A':
                grade = 'B';
                break;
            case 'B':
                grade = 'C';
                break;
            case 'C':
                grade = 'D';
                break;
            case 'D':
                grade = 'E';
                break;
            case 'E':
                grade = 'F';
                break;
            case 'F':
                //nothing changed
                break;
        }
    }

    public String getDetail(){
        return(String.format("Student %s, Grade %c, Group %d", name, grade, group));
    }
}
