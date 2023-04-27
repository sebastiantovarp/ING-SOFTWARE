package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Tarea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CRUDTarea extends CrudRepository<Tarea, Long> {
    List<Tarea> findByDescripcion(String descripcion);
    List<Tarea> findByPrioridad(int prioridad);
    List<Tarea> findByCompletado(boolean completado);
}
