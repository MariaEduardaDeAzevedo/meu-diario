package com.workshop.spring.meu.diario.controller;

import com.workshop.spring.meu.diario.dto.HelloDTO;
import com.workshop.spring.meu.diario.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.workshop.spring.meu.diario.utils.ControllerEndpointConstants.HELLO;

/*
    No contexto de APIs REST o controler é a interface de comunicação mais externa,
    onde iremos definir o endereço das ENDPOINTS.

    É uma boa prática não implementar lógica nos controllers, eles servem apenas para
    DELEGAR a responsabilidade.
*/
@RestController
@RequestMapping(HELLO) // anotação que define a rota geral das endpoints desse controller
public class HelloWorldController {

    /*
        @Autowired é uma anotação para o padrão de projeto de INJEÇÃO DE DEPENDÊNCIA no Spring Boot.
        Esse padrão consiste em aplicar inversão de controle em uma classe que tem como componente uma
        outra classe a qual esta utiliza de seus métodos, sem a necessidade de realizar a instanciação
        explícita dessa estrutura.

        https://blog.algaworks.com/injecao-de-dependencias-spring/
     */
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/")
    public String helloGet() {
        return helloService.sayHello();
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> helloPost(@RequestBody HelloDTO helloDTO) {
        return helloService.saveHello(helloDTO);
    }
}
