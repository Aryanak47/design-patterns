package com.example.controller;


import com.example.DTO.InstitutionDTO;
import com.example.entity.Institution;
import com.example.error.InstitutionNotFoundException;
import com.example.services.InstitutionService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import java.util.List;



@Controller("/institution")
public class InstitutionController {

    @Inject
    InstitutionService institutionService;

    @Post
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<InstitutionDTO> createInstitution(@Body InstitutionDTO institutionDTO){

        if(institutionService.IsInstitutionExist(institutionDTO.getName())){
            throw new InstitutionNotFoundException("Institution already exists with this name "+ institutionDTO.getName(), HttpStatus.NOT_FOUND);
        }
        InstitutionDTO savedInstitution = institutionService.createInstitution(institutionDTO);
        return HttpResponse.created(savedInstitution);

    }

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public List<InstitutionDTO> getInstitutions(){
        return institutionService.getAllInstitution();
    }

    @Get("/{id}/grades")
    @Produces(MediaType.APPLICATION_JSON)
    public InstitutionDTO getGrades(@PathVariable Long id){

        return institutionService.getInstitution(id);

        // Another way

            //        institutionRepository.findById(id).map(
            //        institution -> {
            //            List<Grade> grades = gradeRepository.findByInstitution(institution);
            //            return ok(grades.stream().map(g -> new GradeDto( g.getName())));
            //        }).orElseGet(HttpResponse::notFound);

    }

}
