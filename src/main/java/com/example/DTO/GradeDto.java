package com.example.DTO;

import com.example.entity.Grade;
import com.example.entity.Institution;
import io.micronaut.core.annotation.Introspected;


@Introspected
public  class GradeDto {
    private String name;
    private Institution institution;

    public GradeDto(String name) {
        this.name = name;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Grade getEntity(){
        Grade grade = new Grade();
        grade.setName(this.getName());
        return grade;
    }
}