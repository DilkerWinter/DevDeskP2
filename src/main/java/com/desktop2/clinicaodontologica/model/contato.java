package com.desktop2.clinicaodontologica.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11, name = "cpf")
    private int cpf;

    @Column(name = "informacao")
    private String informacao;

    @Column(name = "nome")
    private String nome;


}

