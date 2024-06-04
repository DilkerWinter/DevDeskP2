package com.desktop2.clinicaodontologica.Service;

import com.desktop2.clinicaodontologica.Model.Funcionario.Cargo;
import com.desktop2.clinicaodontologica.Model.Funcionario.Funcionario;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.Contato;
import com.desktop2.clinicaodontologica.Model.Paciente.Contato.TipoContato;
import com.desktop2.clinicaodontologica.Model.Paciente.Paciente;
import com.desktop2.clinicaodontologica.Repository.Funcionario.CargoRepository;
import com.desktop2.clinicaodontologica.Repository.Funcionario.FuncionarioRepository;
import com.desktop2.clinicaodontologica.Repository.Paciente.PacienteRepository;
import com.desktop2.clinicaodontologica.Service.Assets.Login;
import com.desktop2.clinicaodontologica.Service.Assets.PasswordEncrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;
    private final CargoRepository cargoRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository, CargoRepository cargoRepository) {
        this.funcionarioRepository= funcionarioRepository;
        this.cargoRepository = cargoRepository;
    }

    public String newFuncionario(Funcionario funcionario) {
        funcionario.setSenha(PasswordEncrypt.encrypt(funcionario.getSenha()));
        funcionarioRepository.save(funcionario);
        return "Funcionario cadastrado com sucesso!";
    }

    public String loginFuncionario(Login login) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findByUsuario(login.getUsuario());
        if (!funcionarioOptional.isPresent()) {
            return "Usuario nao encontrado";
        }
        Funcionario funcionario = funcionarioOptional.get();
        if(funcionario.getSenha().equals(PasswordEncrypt.encrypt(login.getSenha()))) {
            return "Logado";
        }else {
            return "Senha Invalida";
        }
    }

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public String newCargo(Cargo cargo) {
        cargoRepository.save(cargo);
        return "Cargo cadastrado com sucesso!";
    }

    public String addCargoExistente(Funcionario funcionario, String nomeCargo) {
        Cargo cargo = cargoRepository.findByCargo(nomeCargo);
        if (cargo == null) {
            throw new RuntimeException("Tipo não encontrada");
        }
        funcionario.setCargo(cargo);

        return cargo.getCargo();
    }
}
