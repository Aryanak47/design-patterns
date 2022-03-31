package com.example.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Institution {
    private List<Grade> grades = new ArrayList<>();
    private String name;

    public Institution(String name){
        this.name = name;

    }
    abstract void getSubjectPeriods();

    public String getName() {
        return name;
    }

    public  List<Grade> getGrades(){
        return grades;
    }

    public void addClass(Grade c){
        grades.add(c);
    }

    @Override
    public String toString() {
        return "Institution{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                '}';
    }
}
