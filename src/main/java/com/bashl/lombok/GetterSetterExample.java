package com.bashl.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GetterSetterExample {

    @Getter @Setter private int age = 10;
    @Getter @Setter private double averageGrade = 2.5;


    @Setter(AccessLevel.PROTECTED) private String name;

    @Override
    public String toString() {
        return "GetterSetterExample{" +
                "age=" + age +
                ", averageGrade=" + averageGrade +
                ", name='" + name + '\'' +
                '}';
    }
}
