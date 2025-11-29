package com.ex.back_end.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterDTO(
        @NotBlank(message = "O nome é obrigatório")
        String name,

        @NotBlank(message = "O email é obrigatório")
        @Email(message = "Email inválido")
        String email,

        @NotBlank(message = "A senha é obrigatória")
        @Size(min = 8, max = 100, message = "A senha deve ter pelo menos 8 caracteres")
        String password,

        @NotBlank(message = "A senha de confirmação é obrigatória")
        @Size(min = 8, max = 100, message = "A senha de confirmação deve ter pelo menos 8 caracteres")
        String passwordConfirm
) {
}
