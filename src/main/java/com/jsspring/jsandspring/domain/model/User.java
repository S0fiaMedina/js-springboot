package com.jsspring.jsandspring.domain.model;

public class User {

    private static  long countUser = 0;

    private long id;

    private String name;

    private String email;

    private String createdAt;

    public User() {
        this.id = User.countUser++;
    }

    public User( String name, String email, String createdAt) {
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
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
