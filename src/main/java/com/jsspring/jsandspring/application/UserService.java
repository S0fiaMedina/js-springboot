package com.jsspring.jsandspring.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsspring.jsandspring.domain.dto.UserDto;
import com.jsspring.jsandspring.domain.model.User;
import com.jsspring.jsandspring.domain.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Long createNewUser(UserDto userDto){
        User newUser = UserDto.dtoToUserModel(userDto);
        return this.userRepository.saveInformation(newUser);

    }

    public List<User> getAllUsers(){
        return this.userRepository.findAllUsers();
    }
   

}
