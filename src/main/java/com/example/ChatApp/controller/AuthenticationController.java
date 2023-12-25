package com.example.ChatApp.controller;


import com.example.ChatApp.dto.login.LoginRequestDTO;
import com.example.ChatApp.dto.login.LoginResponseDTO;
import com.example.ChatApp.dto.register.RegisterRequestDTO;
import com.example.ChatApp.dto.register.RegisterResponseDTO;
import com.example.ChatApp.exceptions.RecordNotFoundException;
import com.example.ChatApp.service.JwtAuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
@RequiredArgsConstructor
public class AuthenticationController {

    private final JwtAuthenticationService authService;

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody RegisterRequestDTO dto){
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping("login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO dto) throws RecordNotFoundException {
        return ResponseEntity.ok(authService.login(dto));
    }
}
