package com.desktop2.clinicaodontologica.Service;

import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Cidade;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Endereco;
import com.desktop2.clinicaodontologica.Model.Paciente.Endereco.Uf;
import com.desktop2.clinicaodontologica.Repository.Endereco.CidadeRepository;
import com.desktop2.clinicaodontologica.Repository.Endereco.EnderecoRepository;
import com.desktop2.clinicaodontologica.Repository.Endereco.UfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    private final UfRepository ufRepository;
    private final CidadeRepository cidadeRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository, UfRepository ufRepository, CidadeRepository cidadeRepository) {
        this.enderecoRepository = enderecoRepository;
        this.ufRepository = ufRepository;
        this.cidadeRepository = cidadeRepository;
    }

    public String newEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
        return "Endereco created successfully!";
    }

    public String newCidade(Cidade cidade) {
        cidadeRepository.save(cidade);
        return "Cidade created successfully!";
    }

    public List<Endereco> getAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public String addUfExistente(Cidade cidade, String siglaUf) {
        Uf uf = ufRepository.findById(siglaUf).orElseThrow(() -> new RuntimeException("UF não encontrada"));
        cidade.setUf(uf);

        return uf.getSigla();
    }

    public String addCidadeExistente(Endereco endereco, String nomeCidade) {
        Cidade cidade = cidadeRepository.findByNome(nomeCidade);
        if (cidade == null) {
            throw new RuntimeException("Cidade não encontrada");
        }
        endereco.setCidade(cidade);

        return cidade.getNome();
    }

}
