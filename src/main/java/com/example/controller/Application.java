package com.example.controller;

import com.example.dao.InstitutionDatabase;
import com.example.entities.Grade;
import com.example.entities.Institution;
import com.example.entities.Subject;
import com.example.factory.InstitutionFactory;
import io.micronaut.runtime.Micronaut;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        InstitutionDatabase.getInstance().loadData();





    }
}
