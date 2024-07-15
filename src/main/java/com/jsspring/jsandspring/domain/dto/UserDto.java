package com.jsspring.jsandspring.domain.dto;

public class UserDto {
    private Long idUser;

    private String name;

    private String email;

    private String createdAt;

    private String nameDegree;

    private String University;

    private String obtainedAt;

    public UserDto() {}

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNameDegree() {
        return nameDegree;
    }

    public void setNameDegree(String nameDegree) {
        this.nameDegree = nameDegree;
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
