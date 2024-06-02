package com.desktop2.clinicaodontologica.Repository.Contato;

import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.TipoContato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContatoRepository extends JpaRepository<TipoContato, String> {
    TipoContato findByTipo(String tipo);
}
