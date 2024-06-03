package com.desktop2.clinicaodontologica.Repository.Funcionario;

import com.desktop2.clinicaodontologica.Model.Funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    Optional<Funcionario> findByUsuario(String usuario);
}


