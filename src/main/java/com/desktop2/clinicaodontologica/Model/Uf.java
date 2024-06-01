package com.desktop2.clinicaodontologica.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "uf")
public class Uf {

    @Id
    @Column
    private String sigla;
}
