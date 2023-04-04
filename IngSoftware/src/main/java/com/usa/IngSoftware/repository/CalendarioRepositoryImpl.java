package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class CalendarioRepositoryImpl {

    @Autowired
    private CalendarioRepository calendarioRepository;


    public Optional<Calendario> findById(Long id) {
        return calendarioRepository.findById(id);
    }


    public Long findID(String userName) {
        // No implementado
        return null;
    }


    public Optional<Calendario> findByID(Long id) {
        return calendarioRepository.findById(id);
    }


    public List<Calendario> findAll() {
        return (List<Calendario>) calendarioRepository.findAll();
    }


    public <S extends Calendario> S save(S s) {
        return calendarioRepository.save(s);
    }


    public void delete(Calendario calendario) {
        calendarioRepository.delete(calendario);
    }

    public void asignarTarea(Long id, String tarea, int dia, int hora) {
        Optional<Calendario> optionalCalendario = calendarioRepository.findById(id);
        if (optionalCalendario.isPresent()) {
            Calendario calendario = optionalCalendario.get();
            String[][] tareas = calendario.getTarea();
            tareas[dia][hora] = tarea;
            calendario.setTarea(tareas);
            calendarioRepository.save(calendario);
        } else {
            throw new NoSuchElementException("No existe calendario para la fecha  " + id);
        }
    }
}
