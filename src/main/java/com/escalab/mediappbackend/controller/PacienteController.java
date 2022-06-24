package com.escalab.mediappbackend.controller;

import com.escalab.mediappbackend.model.Paciente;
import com.escalab.mediappbackend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")// para que quede en nivel 2
public class PacienteController {

    private final PacienteService pacienteService;//Inyección de dependencia de PacienteService

    @Autowired //por si hacemos unos test unitarios en paciente controller, nos pida private final PacienteService pacienteService; como dependencia el test
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> findAll(){
        return pacienteService.findAll();
    }

    @GetMapping("{id}")
    public Paciente findById(@PathVariable("id") Integer id){
        return pacienteService.findById(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Paciente> findAllByName(@PathVariable("nombre") String nombre){
        return pacienteService.findAllByName(nombre);
    }

    @PostMapping
    public Paciente save(@RequestBody Paciente paciente){
        return pacienteService.save(paciente);
    }

    @PutMapping("/{id}")
    public Paciente update(@RequestBody Paciente paciente, @PathVariable("id") Integer id){
        return pacienteService.update(paciente, id);
    }
}
