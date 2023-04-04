package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.data.repository.CrudRepository;

public interface CalendarioRepository extends CrudRepository<Calendario, Long> {
    void asignarTarea(Long id, String tarea, int dia, int hora);
}
