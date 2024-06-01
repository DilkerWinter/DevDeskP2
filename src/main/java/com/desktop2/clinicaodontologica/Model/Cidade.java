package com.desktop2.clinicaodontologica.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Column(nullable = false)
    private String nome;


}
