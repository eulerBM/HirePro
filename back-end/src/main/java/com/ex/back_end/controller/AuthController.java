package com.ex.back_end.controller;

import com.ex.back_end.dto.LoginDTO;
import com.ex.back_end.dto.RegisterDTO;
import com.ex.back_end.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public void login(LoginDTO data){

        return authService.LoginService(data);

    }

    @PostMapping
    public void register(RegisterDTO data){
        
        return authService.RegisterSerivce(data);

    }
}
