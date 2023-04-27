package com.usa.IngSoftware.controller;

import com.usa.IngSoftware.entities.Persona;
import com.usa.IngSoftware.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class ControladorPersona {

    @Autowired
    private PersonaService personaService;
    @PostMapping("/save")
    public Persona save(@RequestBody Persona p){
        return personaService.save(p);
    }


}
