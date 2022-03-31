package com.example.entities;

import java.util.Map;

public class DeerWalk extends Institution {

    public DeerWalk(String name){
        super(name);

    }
    @Override
    void getSubjectPeriods() {
        getGrades().forEach(grade -> {
            Map<String, Subject> period = grade.getPeriod();
            System.out.println(period);

        });


    }
}
