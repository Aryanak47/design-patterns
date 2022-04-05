package com.example.repository;

import com.example.entity.Grade;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GradeRepository  extends CrudRepository<Grade,Long> {
//    Optional<List<Grade>> findAllByInstitution(Long institutionId);

    @Query("From Grade where institutionId = :institutionId")
    Iterable<Grade> findAllByInstitution(Long institutionId);

}
