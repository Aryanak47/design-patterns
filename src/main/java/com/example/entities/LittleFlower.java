package com.example.entities;

import java.util.Map;

public class LittleFlower extends Institution{

    public LittleFlower(String name){
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
