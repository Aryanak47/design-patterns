package com.example.designpattern.database.factory;

import com.example.designpattern.database.entities.DeerWalk;
import com.example.designpattern.database.entities.Institution;
import com.example.designpattern.database.entities.LittleFlower;

public class InstitutionFactory {
    private String channel;

    public InstitutionFactory(String channel){
        this.channel = channel;

    }

    public   Institution createInstitution(){
        switch (channel) {
            case "deerwalk":
                return new DeerWalk("Deer Walk");
            case "littleflower":
                return new LittleFlower("Little Flower");
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }

    }
}
