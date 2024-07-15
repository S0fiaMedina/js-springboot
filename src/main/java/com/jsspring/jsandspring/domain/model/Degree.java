package com.jsspring.jsandspring.domain.model;

public class Degree {

    private Long idUser;

    private String name;

    private String University;

    private String obtainedAt;


    public Degree() {
    }



    public Long getId() {
        return idUser;
    }

    public void setId(Long id) {
        this.idUser = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public String getObtainedAt() {
        return obtainedAt;
    }

    public void setObtainedAt(String obtainedAt) {
        this.obtainedAt = obtainedAt;
    }


    



}
