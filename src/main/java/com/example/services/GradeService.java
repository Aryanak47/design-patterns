package com.example.services;

import com.example.entity.Grade;
import com.example.repository.GradeRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
public class GradeService {

    @Inject
    GradeRepository gradeRepository;

    public Iterable<Grade> getGrades(long id){
        return gradeRepository.findAllByInstitution(id);
    }

    public Grade createGrade(Grade grade){
        return gradeRepository.save(grade);
    }



}
