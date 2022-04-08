package com.example.repository;

import com.example.entity.Grade;
import com.example.entity.Institution;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;


@Repository
public interface GradeRepository  extends JpaRepository<Grade,Long> {
    List<Grade> findByInstitution(Institution institution);

//    @Query("From Grade where institutionId = :institutionId")
//    Iterable<Grade> findAllByInstitution(Long institutionId);

}
