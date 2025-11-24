package com.ex.back_end.controller;

import com.ex.back_end.dto.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {

    @GetMapping
    public void login(LoginDTO data){

    }
}
