package com.desktop2.clinicaodontologica.Service;

import com.desktop2.clinicaodontologica.Model.Paciente.Paciente;
import com.desktop2.clinicaodontologica.Repository.Paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public String newPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
        return "Paciente cadastrado com sucesso!";
    }

    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }
}
