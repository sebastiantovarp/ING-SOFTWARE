package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDCalendario extends CrudRepository<Calendario, Long> {
    void asignarTarea(Long id, String tarea, int dia, int hora);
}
