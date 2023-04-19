package com.usa.IngSoftware.controller;

import com.usa.IngSoftware.entities.Calendario;
import com.usa.IngSoftware.services.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/calendario")
public class ControladorCalendario {

    @Autowired
    private CalendarioService calendario;

    @GetMapping("/prueba")
    public List<Calendario> saludo(){
        try{
            DateFormat formateador= new SimpleDateFormat("dd/M/yy");
            Date fecha = formateador.parse("12/12/2022");

            return calendario.getCalendar(1L, fecha,new Date());

        }catch(ParseException e){

        }
        return new ArrayList<>();
    }
    @GetMapping("/all")
    public List<Calendario> getAll(){
        return calendario.GetAll();
    }
    @PostMapping("/save")
    public Calendario save(@RequestBody Calendario c){
        return calendario.save(c);
    }







}
