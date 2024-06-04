package com.desktop2.clinicaodontologica.Repository.Funcionario;

import com.desktop2.clinicaodontologica.Model.Funcionario.Cargo;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CargoRepository extends JpaRepository<Cargo, String> {
    Cargo findByCargo(String cargo);
}


