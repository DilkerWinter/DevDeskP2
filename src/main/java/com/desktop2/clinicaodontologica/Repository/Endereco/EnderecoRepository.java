package com.desktop2.clinicaodontologica.Repository.Endereco;

import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
