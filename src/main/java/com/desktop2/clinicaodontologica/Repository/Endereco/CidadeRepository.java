package com.desktop2.clinicaodontologica.Repository.Endereco;

import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, String> {
    Cidade findByNome(String nome);
}