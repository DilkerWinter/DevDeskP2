package com.desktop2.clinicaodontologica.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Entity
public class agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private Date data;

    @Column(name = "hora")
    private Date hora;

    @Column(name = "dentista_id")
    private int dentista_id;

    @Column(name = "usuario")
    private int usuario;

    @Column(name = "funcao_id")
    private int funcao_id;

    @Column(name = "paciente_id")
    private int paciente_id;

    @Column(name = "recepcionista_id")
    private int recepcionista_id;
}
