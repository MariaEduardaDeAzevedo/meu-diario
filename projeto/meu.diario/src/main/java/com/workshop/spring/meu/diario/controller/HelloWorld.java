package com.workshop.spring.meu.diario.controller;

import com.workshop.spring.meu.diario.dto.HelloDTO;
import com.workshop.spring.meu.diario.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.workshop.spring.meu.diario.utils.ControllerEndpointConstants.HELLO;

@RestController
@RequestMapping(HELLO)
public class HelloWorld {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/")
    public String helloGet() {
        return "Hello, World!";
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> helloPost(@RequestBody HelloDTO helloDTO) {
        return helloService.saveHello(helloDTO);
    }
}
