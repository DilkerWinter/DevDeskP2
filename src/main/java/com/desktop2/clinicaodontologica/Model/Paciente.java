package com.desktop2.clinicaodontologica.Model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Date dataNascimento;



}