package com.desktop2.clinicaodontologica.Controller;

import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import com.desktop2.clinicaodontologica.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EnderecoController {

    private final EnderecoService enderecoService;

    @Autowired
    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    public String newEndereco(Endereco endereco) {
        return enderecoService.newEndereco(endereco);
    }

    public String newCidade(Cidade cidade) {
        return enderecoService.newCidade(cidade);
    }

    public List<Endereco> getAllEnderecos() {
        return enderecoService.getAllEnderecos();
    }

    public String addUfExistente(Cidade cidade, String siglauf) {
        return enderecoService.addUfExistente(cidade, siglauf);
    }
}
