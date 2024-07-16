package com.jsspring.jsandspring.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jsspring.jsandspring.domain.model.User;

@Repository
public interface UserRepository {
    
    public long saveInformation(User user);

    public List<User> findAllUsers();
}
