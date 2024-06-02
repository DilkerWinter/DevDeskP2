package com.desktop2.clinicaodontologica.Controller;

import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.TipoContato;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import com.desktop2.clinicaodontologica.Repository.Contato.ContatoRepository;
import com.desktop2.clinicaodontologica.Service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContatoController {
    private final ContatoService contatoService;

    @Autowired
    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }


    public String newContato(Contato contato) {
        return contatoService.newContato(contato);
    }

    public String newTipoContato(TipoContato tipoContato) {
        return contatoService.newTipoContato(tipoContato);
    }

}
