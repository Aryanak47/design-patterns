package com.example.dao;

import com.example.entities.Grade;
import com.example.entities.Institution;
import com.example.entities.Subject;
import com.example.factory.InstitutionFactory;

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
        Subject science = Subject.newBuilder()
                .setName("Science")
                .setDescription("vertebrates and invertebrates, oviparous and viviparous animals," +
                        " terrestrial animals and their features, aquatic animals, life process, " +
                        "reproduction in plants, terrestrial plants and their features, aquatic plants," +
                        " balance in nature, matter. ")
                .build();
        Subject english = Subject.newBuilder()
                .setName("English")
                .setDescription("be careful, me and my habits, the elephant and the tortoise," +
                        " a brave woman, the largest living bird, a cruel landlord, " +
                        "a clever little girl and ogre, two close friends," +
                        " the six men and the elephant, sports day. ")
                .build();

        Grade c = new Grade(4);

        Map<String,Subject> periods = new HashMap<>();
        periods.put("8am",science);
        periods.put("9:15am",english);

        c.addSubject(science);
        c.addSubject(english);
        c.setPeriod(periods);

        Institution institution = InstitutionFactory.createInstitution("deerwalk");
        institution.addClass(c);

        System.out.println(institution);

    }



}
