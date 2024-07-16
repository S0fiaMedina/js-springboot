package com.jsspring.jsandspring.domain.dto;


import com.jsspring.jsandspring.domain.model.User;

public class UserDto {
    private long idUser;

    private String name;

    private String email;

    private String createdAt;

    public UserDto() {}

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
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

   
    public static User  dtoToUserModel(UserDto userDto){
        User newModel =  new User();
        newModel.setName(userDto.getName());
        userDto.setIdUser(newModel.getId());
        newModel.setEmail(userDto.getEmail());
        newModel.setCreatedAt(userDto.getCreatedAt());
       
        return newModel;
    }
    
}
