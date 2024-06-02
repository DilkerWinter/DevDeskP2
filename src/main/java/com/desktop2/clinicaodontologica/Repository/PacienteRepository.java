package com.desktop2.clinicaodontologica.Repository;

import com.desktop2.clinicaodontologica.Model.Paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {


}


