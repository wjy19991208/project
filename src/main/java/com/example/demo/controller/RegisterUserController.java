package com.example.demo.controller;

import com.example.demo.entity.Login;
import com.example.demo.service.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterUserController {
    @Autowired
    private RegisterUserService registerUserService;

    @PostMapping("/registerUser")
    public String registerUserSubmit(@ModelAttribute  Login login){
        return "login";

    }
}
