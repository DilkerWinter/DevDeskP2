package com.desktop2.clinicaodontologica.Controller;

import com.desktop2.clinicaodontologica.Model.Paciente.Paciente;
import com.desktop2.clinicaodontologica.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PacienteController {
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    public String newPaciente(Paciente paciente) {
        return pacienteService.newPaciente(paciente);
    }
}
