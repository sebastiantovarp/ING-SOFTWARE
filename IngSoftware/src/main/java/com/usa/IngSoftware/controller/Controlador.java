package com.usa.IngSoftware.controller;

import com.usa.IngSoftware.entities.Calendario;
import com.usa.IngSoftware.entities.Persona;
import com.usa.IngSoftware.services.CalendarioService;
import com.usa.IngSoftware.services.PersonaService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/registro")
public class Controlador {

    private CalendarioService calendario;
    private PersonaService personaService;

    @GetMapping
    public String saludo(){
        return"<h1>Inicio</h1>";
    }
    @GetMapping("/get-all")
    public List<Calendario> getAll(){
        return calendario.GetAll();
    }
    @PostMapping("/save-c")
    public Calendario save(@RequestBody Calendario c){
        return calendario.save(c);
    }

    @PostMapping("/save-p")
    public Persona save(@RequestBody Persona p){
        return personaService.save(p);
    }





}
