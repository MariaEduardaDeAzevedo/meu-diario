package com.workshop.spring.meu.diario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    Entidade mais básica do meu sistema. Vai especificar como são criadas as tabelas no BD
    que representam meus dados dentro da aplicação.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "timestamp")
    private String timestamp;

    public Hello(String name) {
        this.name = name;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
