package com.example.designpattern.database.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grade {
    private int name;
    private List<Subject> subjects = new ArrayList<>();
    private Map<String, Subject> period = new HashMap<>();

    public Grade(int name){
        this.name = name;

    }

    public void addSubject(Subject s){
        subjects.add(s);
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public Map<String, Subject> getPeriod() {
        return period;
    }

    public void setPeriod(Map<String, Subject> period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name=" + name +
                ", subjects=" + subjects +
                ", period=" + period +
                '}';
    }
}
