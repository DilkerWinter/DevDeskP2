package com.desktop2.clinicaodontologica.Controller;

import com.desktop2.clinicaodontologica.Model.Funcionario.Cargo;
import com.desktop2.clinicaodontologica.Model.Funcionario.Funcionario;
import com.desktop2.clinicaodontologica.Service.Assets.Login;
import com.desktop2.clinicaodontologica.Service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }


    public String newFuncionario(Funcionario funcionario) {
        return funcionarioService.newFuncionario(funcionario);
    }

    public List<Funcionario> getAllFuncionario() {
        return funcionarioService.getAllFuncionarios();
    }

    public String loginFuncionario(Login login) {
        return funcionarioService.loginFuncionario(login);
    }

    public String newCargo(Cargo cargo) {
        return funcionarioService.newCargo(cargo);
    }
}
