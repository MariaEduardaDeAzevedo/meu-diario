package com.workshop.spring.meu.diario.service;

import com.workshop.spring.meu.diario.dto.HelloDTO;
import com.workshop.spring.meu.diario.dto.HelloResponseDTO;
import com.workshop.spring.meu.diario.model.Hello;
import com.workshop.spring.meu.diario.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public ResponseEntity<HelloResponseDTO> saveHello(HelloDTO helloDTO) {
        Hello hello = new Hello(helloDTO.getName());
        helloRepository.save(hello);

        return ResponseEntity.status(200).body(new HelloResponseDTO(200, helloDTO.getName()));
    }
}
