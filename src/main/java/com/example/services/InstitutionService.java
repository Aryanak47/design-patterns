package com.example.services;


import com.example.entity.Grade;
import com.example.entity.Institution;
import com.example.repository.InstitutionRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Singleton
public class InstitutionService {

    @Inject
    InstitutionRepository institutionRepository;

    public Iterable<Institution> getAllInstitution(){
        return institutionRepository.findAll();
    }

    public Institution updateInstitution(Institution institution){
        return institutionRepository.update(institution);

    }

    public void deleteInstitution(long id){
        institutionRepository.deleteById(id);
    }

    public Institution createInstitution(Institution institution){
        return institutionRepository.save(institution);
    }

    public Institution getInstitution(long id){
        Optional<Institution> institution = institutionRepository.findById(id);
        return institution.orElse(null);
    }
    public Boolean IsInstitutionExist(String name){
       Institution institution =  institutionRepository.findByName(name);
       if(institution != null){
           return true;
       }
       return false;
    }

}
