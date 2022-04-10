package com.example.DTO;

import com.example.entity.Grade;
import com.example.entity.Institution;
import io.micronaut.core.annotation.Introspected;

import javax.persistence.Column;
import java.util.HashSet;
import java.util.Set;

@Introspected
public class InstitutionDTO {
    private long id;
    private String name;
    private String location;
    private String phoneNumber;
    private Set<GradeDto> grades = new HashSet<>();

    public Institution toEntity(){
        Institution institution = new Institution();
        institution.setLocation(this.location);
        institution.setName(this.name);
        institution.setPhoneNumber(phoneNumber);
        return institution;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<GradeDto> getGrades() {
        return grades;
    }

    public void setGrades(Set<GradeDto> grades) {
        this.grades = grades;
    }
}
