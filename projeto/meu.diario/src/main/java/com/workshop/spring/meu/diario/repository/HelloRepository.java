package com.workshop.spring.meu.diario.repository;

import com.workshop.spring.meu.diario.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
    Padrão de projeto que se propõe em ser uma camada de gerenciamento de persistência
    de dados.
 */
@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {

}
