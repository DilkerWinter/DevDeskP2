package com.desktop2.clinicaodontologica.Model.Funcionario;


import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table (name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}