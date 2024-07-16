package com.jsspring.jsandspring.infrastructure.Adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jsspring.jsandspring.domain.model.User;
import com.jsspring.jsandspring.domain.repository.UserRepository;

@Component
public class UserRepositoryImpl  implements UserRepository{

    private List<User> users = new ArrayList<>();

    @Override
    public long saveInformation(User newUser) {
        this.users.add(newUser);
        return newUser.getId();
    }

    @Override
    public List<User> findAllUsers() {
        return this.users;  
    }


    
    
}
