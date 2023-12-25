package com.example.ChatApp.dto.login;

import com.example.ChatApp.dto.register.RegisterRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDTO {
    private String confirmPassword;
    private String userName;
    private String password;
}
