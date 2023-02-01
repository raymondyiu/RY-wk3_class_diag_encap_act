package org.example;

public enum Group {
    one(1),two(2),three(3),four(4),five(5);
    private final int group;
    Group(int group){
        this.group = group;
    }
    int value() {return group;}
}
