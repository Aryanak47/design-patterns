package com.example.designpattern.database.entities;

import java.util.*;

public abstract class Institution {
    private final Set<Grade> grades = new TreeSet<>();
    private final String name;

    public Institution(String name){
        this.name = name;

    }
    abstract void getSubjectPeriods();

    public String getName() {
        return name;
    }

    public  Set<Grade> getGrades(){
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
