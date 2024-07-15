package com.jsspring.jsandspring.domain.model;

public class User {

    private static  Long countUser;

    private Long id;

    private String name;

    private String email;

    private String createdAt;

    public User() {
        
    }

    public User( String name, String email, String createdAt) {
        this.id = User.countUser += 1;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }



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

    


    
}
