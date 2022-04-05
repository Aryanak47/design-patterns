package com.example.controller;

import com.example.entity.Grade;
import com.example.services.GradeService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;

@Controller("/grade")
public class GradeController {

    @Inject
    GradeService gradeService;

    @Get("/institution/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Iterable<Grade> getInstitutionGrades(@PathVariable long id){
        System.out.println(id);
        return gradeService.getGrades(id);

    }

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public Grade createGrade(@Body Grade grade){
        return gradeService.createGrade(grade);
    }
}
