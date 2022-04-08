package com.example.controller;

import com.example.DTO.GradeDto;
import com.example.entity.Grade;
import com.example.repository.InstitutionRepository;
import com.example.services.GradeService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import javax.transaction.Transactional;

import static io.micronaut.http.HttpResponse.ok;


@Controller("/grade")
public class GradeController {

    @Inject
    GradeService gradeService;

    @Inject
    InstitutionRepository institutionRepository;

    @Post("/{id}/institution")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public  HttpResponse<?> createGrade(@PathVariable long id,@Body GradeDto gradeDto){
        return ok(gradeService.createGrade(gradeDto,id));
    }
}
