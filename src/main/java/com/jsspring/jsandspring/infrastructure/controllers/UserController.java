package com.jsspring.jsandspring.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsspring.jsandspring.application.UserService;
import com.jsspring.jsandspring.domain.dto.UserDto;
import com.jsspring.jsandspring.domain.model.User;


@RequestMapping("/jspsring")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/all-users")
    public String getUsers( Model model){
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("users", users);
        return "allUsers"; 
    }

    @GetMapping("/jspsring")
    public String index(Model model) {
      return "index";
    }

    // Maneja la solicitud GET para mostrar el formulario
    @GetMapping("/add-user")
    public String showCreateUserForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "createUser"; // Nombre de la plantilla para el formulario
    }

    @PostMapping("/add-user")
    @ResponseBody
    public UserDto createUser(@RequestBody UserDto userDto){
        this.userService.createNewUser(userDto);
        return userDto; // Adjusted redirect
    }
}
