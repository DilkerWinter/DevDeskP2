package com.desktop2.clinicaodontologica.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class arquivo  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "observacao")
    private String observacao;

    @Column(length = 255, name = "caminho_arquivo")
    private String caminho_arquivo;

    @Column(name = "consulta_id")
    private int consulta_id;

    @Column(name = "anexos_id")
    private int anexos_id;
}
