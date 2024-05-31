package com.desktop2.clinicaodontologica.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class consultas implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "tipo_pagamento")
    private String tipo_pagamento;

    @Column(name = "valor")
    private int valor;

    @Column(name = "dentista_id")
    private int dentista_id;

    @Column(name = "consulta_id")
    private int consulta_id;

    @Column(name = "paciente_id")
    private int paciente_id;
}
