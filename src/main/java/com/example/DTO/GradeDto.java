package com.example.DTO;

import com.example.entity.Grade;
import com.example.entity.Institution;
import io.micronaut.core.annotation.Introspected;


@Introspected
public  class GradeDto {
    private String name;

    public GradeDto(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Grade toEntity(){
        Grade grade = new Grade();
        grade.setName(this.getName());
        return grade;
    }
    public GradeDto toDto(Grade grade){
        GradeDto gradeDto = new GradeDto(grade.getName());
        return gradeDto;

    }
}