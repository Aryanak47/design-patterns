package com.example.controller;

import com.example.entity.Institution;
import com.example.services.InstitutionService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

@Controller("/institution")
public class InstitutionController {
    @Inject
    InstitutionService institutionService;

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public Object createInstitution(@Body Institution institution){
        if(institutionService.IsInstitutionExist(institution.getName())){
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Institution already exists with this name ");
            stringBuffer.append(institution.getName());
            return stringBuffer.toString();
        }
        return institutionService.createInstitution(institution);
    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Institution> getInstitutions(){
        return institutionService.getAllInstitution();

    }

}
