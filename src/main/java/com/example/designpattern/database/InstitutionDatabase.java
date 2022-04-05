package com.example.designpattern.database;

import com.example.designpattern.database.entities.Grade;
import com.example.designpattern.database.entities.Institution;
import com.example.designpattern.database.entities.Subject;
import com.example.designpattern.database.factory.InstitutionFactory;

import java.util.HashMap;
import java.util.Map;

public class InstitutionDatabase {
    private static InstitutionDatabase single_instance = null;
    private InstitutionDatabase() {}


    public static InstitutionDatabase getInstance()
    {
        if (single_instance == null)
            single_instance = new InstitutionDatabase();

        return single_instance;
    }
    public void loadData(){
        Subject science =  Subject.newBuilder().setName("Science").setDescription("vertebrates and invertebrates, oviparous and viviparous animals").build();
        Subject english =  Subject.newBuilder().setName("English").setDescription("vertebrates and invertebrates, oviparous and viviparous animals").build();

        Grade c = new Grade(4);

        Map<String,Subject> periods = new HashMap<>();
        periods.put("8am",science);
        periods.put("9:15am",english);

        c.addSubject(science);
        c.addSubject(english);
        c.setPeriod(periods);

        Institution institution = new InstitutionFactory("deerwalk").createInstitution();
        institution.addClass(c);

        System.out.println(institution);

    }



}
