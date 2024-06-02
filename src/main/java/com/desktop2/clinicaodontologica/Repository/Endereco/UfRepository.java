package com.desktop2.clinicaodontologica.Repository.Endereco;

import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Uf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UfRepository extends JpaRepository<Uf, String> {
}
