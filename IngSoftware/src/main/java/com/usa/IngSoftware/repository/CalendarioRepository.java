package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CalendarioRepository {

    @Autowired
    private CRUDCalendario CRUDCalendario;


    public Optional<Calendario> findById(Long id) {
        return CRUDCalendario.findById(id);
    }


    public Long findID(String userName) {
        // No implementado
        return null;
    }


    public Optional<Calendario> findByID(Long id) {
        return CRUDCalendario.findById(id);
    }


    public List<Calendario> findAll() {
        return (List<Calendario>) CRUDCalendario.findAll();
    }


    public <S extends Calendario> S save(S s) {
        return CRUDCalendario.save(s);
    }


    public void delete(Calendario calendario) {
        CRUDCalendario.delete(calendario);
    }

    public void asignarTarea(Long id, String tarea, int prioridad, int dia, int hora) {
        Optional<Calendario> optionalCalendario = CRUDCalendario.findById(id);
        Scanner sc = new Scanner(System.in);
        if (optionalCalendario.isPresent()) {
            Calendario calendario = optionalCalendario.get();
            calendario.crearTarea(tarea,prioridad,hora);
            CRUDCalendario.save(calendario);
        } else {
            throw new NoSuchElementException("No existe calendario para la fecha  " + id);
        }
    }
}
