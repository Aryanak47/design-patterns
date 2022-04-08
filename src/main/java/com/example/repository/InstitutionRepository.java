package com.example.repository;

import com.example.entity.Grade;
import com.example.entity.Institution;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.annotation.EntityGraph;
import io.micronaut.data.jpa.repository.JpaSpecificationExecutor;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution,Long> , JpaSpecificationExecutor<Institution> {
    Optional<Institution> findByName(String name);
}
