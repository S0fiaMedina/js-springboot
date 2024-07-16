package com.jsspring.jsandspring.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsspring.jsandspring.application.UserService;
import com.jsspring.jsandspring.domain.dto.UserDto;
import com.jsspring.jsandspring.domain.model.User;


@RequestMapping("/jspsring")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/all-users")
    public String getUsers( Model model){
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users", users);
        return "allUsers.html"; 
    }

    @PostMapping("/add-user")
    public String createUser(@RequestBody UserDto userDto){
        this.userService.createNewUser(userDto);
        return "redirect:/index";
    }
}
