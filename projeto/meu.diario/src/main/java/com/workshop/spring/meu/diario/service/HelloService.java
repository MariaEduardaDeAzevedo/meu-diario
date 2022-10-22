package com.workshop.spring.meu.diario.service;

import com.workshop.spring.meu.diario.dto.HelloDTO;
import com.workshop.spring.meu.diario.dto.HelloResponseDTO;
import com.workshop.spring.meu.diario.model.Hello;
import com.workshop.spring.meu.diario.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/*
    O SERVICE compreende a classe que vai implementar a lógica das funcionalidades das ENDPOINTS.
 */
@Service
public class HelloService {

    /*
        @Autowired é uma anotação para o padrão de projeto de INJEÇÃO DE DEPENDÊNCIA no Spring Boot.
        Esse padrão consiste em aplicar inversão de controle em uma classe que tem como componente uma
        outra classe a qual esta utiliza de seus métodos, sem a necessidade de realizar a instanciação
        explícita dessa estrutura.

        https://blog.algaworks.com/injecao-de-dependencias-spring/
     */
    @Autowired
    private HelloRepository helloRepository;

    public ResponseEntity<HelloResponseDTO> saveHello(HelloDTO helloDTO) {
        Hello hello = new Hello(helloDTO.getName());
        helloRepository.save(hello);

        String helloMessage = String.format("Hello from %s", helloDTO.getName());
        return ResponseEntity.status(200).body(new HelloResponseDTO(200, helloMessage));
    }

    public String sayHello() {
        return "Hello, World!";
    }
}
