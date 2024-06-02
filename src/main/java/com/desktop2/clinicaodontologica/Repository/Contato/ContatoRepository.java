package com.desktop2.clinicaodontologica.Repository.Contato;

import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
