package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name="Grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Column(name="institution_id")
    private Long institutionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getInstitution() {
        return institutionId;
    }

    public void setInstitution(Long institution) {
        this.institutionId = institution;
    }
}
