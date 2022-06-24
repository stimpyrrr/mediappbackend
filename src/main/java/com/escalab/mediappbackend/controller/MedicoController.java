package com.escalab.mediappbackend.controller;

import com.escalab.mediappbackend.model.Medico;
import com.escalab.mediappbackend.model.Paciente;
import com.escalab.mediappbackend.service.MedicoService;
import com.escalab.mediappbackend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private final MedicoService medicoService;

    @Autowired
    //por si hacemos unos test unitarios en medico controller, nos pida private final MedicoService medicoService; como dependencia el test
    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Medico> findAll(){
        return medicoService.findAll();
    }

    @GetMapping("{id}")
    public Medico findById(@PathVariable("id") Integer id){
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico save(@RequestBody Medico medico){
        return medicoService.save(medico);
    }

    @PutMapping("/{id}")
    public Medico update(@RequestBody Medico medico, @PathVariable("id") Integer id){
        return medicoService.update(medico, id);
    }
}
