package com.example.services;



import com.example.DTO.GradeDto;
import com.example.DTO.InstitutionDTO;
import com.example.entity.Institution;
import com.example.error.InstitutionNotFoundException;
import com.example.repository.InstitutionRepository;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Singleton
public class InstitutionService {

    @Inject
    InstitutionRepository institutionRepository;

    public List<InstitutionDTO> getAllInstitution(){
        List<InstitutionDTO> institutions = new ArrayList<>();
         institutionRepository.findAll().forEach(institution -> {
             InstitutionDTO institutionDTO = new InstitutionDTO();
             institutionDTO.setName(institution.getName());
             institutionDTO.setLocation(institution.getLocation());
             institutionDTO.setPhoneNumber(institution.getPhoneNumber());
             institutionDTO.setGrades(institution.getGrades()
                     .stream()
                     .map(grade -> new GradeDto(grade.getName())).collect(Collectors.toSet()));
             institutionDTO.setId(institution.getId());
             institutions.add(institutionDTO);
         });
         return  institutions;
    }

    public Institution updateInstitution(Institution institution){
        return institutionRepository.update(institution);
    }

    public void deleteInstitution(long id){
        institutionRepository.deleteById(id);
    }

    public InstitutionDTO createInstitution(InstitutionDTO institutionDTO){
        Institution institution = institutionDTO.toEntity();
        Institution savedInstitution = institutionRepository.save(institution);
        institutionDTO.setId(savedInstitution.getId());
        return institutionDTO;
    }

    public InstitutionDTO getInstitution(long id){

          Optional<Institution> institution =  institutionRepository.findById(id);
          if(institution.isPresent()){
              InstitutionDTO institutionDTO = new InstitutionDTO();
              institutionDTO.setName(institution.get().getName());
              institutionDTO.setLocation(institution.get().getLocation());
              institutionDTO.setPhoneNumber(institution.get().getPhoneNumber());
              institutionDTO.setGrades(institution.get().getGrades()
                      .stream()
                      .map(grade -> new GradeDto(grade.getName())).collect(Collectors.toSet()));
              institutionDTO.setId(id);
              return institutionDTO;
          }
          throw new InstitutionNotFoundException("There is no institution with this id", HttpStatus.NOT_FOUND);


    }
    public Boolean IsInstitutionExist(String name){
       return institutionRepository.findByName(name).isPresent();
    }

}
