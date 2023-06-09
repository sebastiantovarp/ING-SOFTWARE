package com.usa.IngSoftware.services;

import com.usa.IngSoftware.entities.Calendario;
import com.usa.IngSoftware.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CalendarioService {

    @Autowired
    private CalendarioRepository calendarioRepository;

    public List<Calendario> getCalendar (Long id, Date a, Date b){
        return calendarioRepository.getCalendars(id,a,b);
    }
    public List<Calendario> GetAll(){
        return calendarioRepository.findAll();
    }

    public Calendario save(Calendario c){
        return calendarioRepository.save(c);
    }

    /*public Calendario get(Long id){
        Optional<Calendario> calendario = calendarioRepository.findByID(id);
        if(calendario.isPresent()){
            return calendario.get();
        }else{
            Calendario failure = new Calendario();
            failure.setId(Long.parseLong("-1"));
            System.out.println("El calendario no existe.");
            return failure;
        }
    }*//*
    public void asignarTarea(Long id, String tarea, int prioridad, int dia, int hora) {
        Optional<Calendario> optionalCalendario = calendarioRepository.findById(id);
        Scanner sc = new Scanner(System.in);
        if (optionalCalendario.isPresent()) {
            Calendario calendario = optionalCalendario.get();
            calendario.crearTarea(tarea,prioridad,hora);
            calendarioRepository.save(calendario);
        } else {
            throw new NoSuchElementException("No existe calendario para la fecha  " + id);
        }
    }*/

}
