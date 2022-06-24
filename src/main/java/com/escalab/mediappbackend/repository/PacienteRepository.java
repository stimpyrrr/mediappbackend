package com.escalab.mediappbackend.repository;

import com.escalab.mediappbackend.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JpaRepository nos permitirá manejar lo que son los CRUD //Integer el tipo de dato de la clase primaria de Paciente
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    List<Paciente> findAllByNombres(String nombres);



}
