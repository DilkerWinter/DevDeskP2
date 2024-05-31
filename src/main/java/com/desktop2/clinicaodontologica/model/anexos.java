package com.desktop2.clinicaodontologica.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class anexos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;
}
