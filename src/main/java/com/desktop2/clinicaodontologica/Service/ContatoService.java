package com.desktop2.clinicaodontologica.Service;

import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.TipoContato;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import com.desktop2.clinicaodontologica.Repository.Contato.ContatoRepository;
import com.desktop2.clinicaodontologica.Repository.Contato.TipoContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

    private final ContatoRepository contatoRepository;
    private final TipoContatoRepository tipoContatoRepository;

    @Autowired
    public ContatoService(ContatoRepository contatoRepository, TipoContatoRepository tipoContatoRepository) {
        this.contatoRepository = contatoRepository;
        this.tipoContatoRepository = tipoContatoRepository;
    }

    public String newContato(Contato contato) {
        contatoRepository.save(contato);
        return "Contato created successfully!";
    }

    public String newTipoContato(TipoContato tipoContato) {
        tipoContatoRepository.save(tipoContato);
        return "Tipo contato created successfully!";
    }

    public String addTipoExistente(Contato contato, String nomeTipo) {
        TipoContato tipoContato = tipoContatoRepository.findByTipo(nomeTipo);
        if (tipoContato == null) {
            throw new RuntimeException("Tipo não encontrada");
        }
        contato.setTipoContato(tipoContato);

        return tipoContato.getTipo();
    }
}
