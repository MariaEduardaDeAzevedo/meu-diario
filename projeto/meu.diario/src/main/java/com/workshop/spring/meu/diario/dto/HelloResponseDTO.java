package com.workshop.spring.meu.diario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloResponseDTO {
    public int status;
    public String message;
}
