package com.example.repository;

import com.example.entity.Institution;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution,Long> {
    Institution findByName(String name);



}
