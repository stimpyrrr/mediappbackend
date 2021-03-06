package com.escalab.mediappbackend.service.impl;

import com.escalab.mediappbackend.model.Paciente;
import com.escalab.mediappbackend.repository.PacienteRepository;
import com.escalab.mediappbackend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public List<Paciente> findAllByName(String nombre) {
        return pacienteRepository.findAllByNombres(nombre);
    }

    @Override
    public Paciente findById(Integer id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);// optional es como un try catch de sql
        return paciente.isPresent() ? paciente.get() : new Paciente(); //si paciente existe, me devuelve paciente sino me devuelve un paciente vacio
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public Paciente update(Paciente paciente, Integer id) {
        Optional<Paciente> findPaciente = pacienteRepository.findById(id);// optional es como un try catch de sql
        if (findPaciente.isPresent()){
            paciente.setIdPaciente(id);
            return save(paciente);
        }else{
            //throw new Exception("Error)
            return new Paciente();
        }

    }

    @Override
    public boolean deleteById(Integer id) {
        pacienteRepository.deleteById(id);
        return true;
    }
}
