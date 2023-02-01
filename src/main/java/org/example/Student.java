package org.example;

import java.util.Arrays;
import java.util.List;

public class Student {

    public String name;
    public Grade grade;
    public Group group;
    private String secretNickName;

    public Student(String name, Grade grade, Group group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }


    public void upgrade(){
        switch (grade) {
            case A:
                // Nothing changed
                break;
            case B:
                grade = Grade.A;
                break;
            case C:
                grade = Grade.B;
                break;
            case D:
                grade = Grade.C;
                break;
            case E:
                grade = Grade.D;
                break;
            case F:
                grade = Grade.E;
        }
    }

    public void downgrade(){
        switch (grade) {
            case A:
                grade = Grade.B;
                break;
            case B:
                grade = Grade.C;
                break;
            case C:
                grade = Grade.D;
                break;
            case D:
                grade = Grade.E;
                break;
            case E:
                grade = Grade.F;
                break;
            case F:
                //nothing changed
                break;
        }
    }

    public String getDetail(){
        return(String.format("Student %s, Grade %s, Group %d", name, grade, group.value()));
    }
}
