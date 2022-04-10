package com.example.services;

import com.example.DTO.GradeDto;
import com.example.entity.Grade;
import com.example.entity.Institution;
import com.example.error.InstitutionNotFoundException;
import com.example.repository.GradeRepository;
import com.example.repository.InstitutionRepository;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;


@Singleton
public class GradeService {

    @Inject
    GradeRepository gradeRepository;

    @Inject
    InstitutionRepository institutionRepository;

    public GradeDto createGrade(GradeDto gradeDto,long id){
        Optional<Institution> institution = institutionRepository.findById(id);
        if (institution.isEmpty()) {
            throw new InstitutionNotFoundException("There is no institution with this id", HttpStatus.BAD_REQUEST);
        }

        Grade grade = gradeDto.getEntity();
        grade.setInstitution(institution.get());
        institution.get().getGrades().add(grade);
         gradeRepository.save(grade);
         return gradeDto;


//        Grade g =  gradeRepository.save(grade);
//        long institutionId = grade.getInstitution();
//        Institution institution = institutionRepository.findById(institutionId).get();
//        institution.getGrades().add(grade);
//        institutionRepository.update(institution);


    }



}
