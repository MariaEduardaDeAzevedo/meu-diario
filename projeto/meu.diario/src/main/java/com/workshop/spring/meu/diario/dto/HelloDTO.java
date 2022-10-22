package com.workshop.spring.meu.diario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloDTO {
    private String name;
}

/*
    Na requisição, essa classe toma essa forma:

    {
        nome: "Fulano de Tal"
    }
 */
