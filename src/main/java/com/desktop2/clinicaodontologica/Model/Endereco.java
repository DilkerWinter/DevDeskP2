package com.desktop2.clinicaodontologica.Model;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private String numero;



}