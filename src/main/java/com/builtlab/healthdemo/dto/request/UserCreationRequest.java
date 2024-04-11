package com.builtlab.healthdemo.dto.request;

import com.builtlab.healthdemo.exception.ErrorCode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    String username;
    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;
    @NotNull
    @NotEmpty
    @NotBlank
    String firstName;
    @NotNull
    String lastName;
    String phoneNumber;
    String email;
    LocalDate dateOfBirth;
    LocalDate dateOfCreate;
}
