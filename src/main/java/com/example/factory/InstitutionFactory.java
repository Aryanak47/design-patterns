package com.example.factory;

import com.example.entities.DeerWalk;
import com.example.entities.Institution;
import com.example.entities.LittleFlower;

public class InstitutionFactory {
    public static  Institution createInstitution(String channel){
        if (channel == null || channel.isEmpty())
            return null;
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
