package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TareaRepository {

    @Autowired
    private CRUDTarea crudTarea;


    public void crearTarea(Tarea tarea) {
        crudTarea.save(tarea);
    }

    public Tarea findById(Long id) {
        return crudTarea.findById(id).orElse(null);
    }
    public List<Tarea> findByDescripcion(String descripcion){
        return crudTarea.findByDescripcion(descripcion);
    }
    public List<Tarea> findByPrioridad(int prioridad){
        return crudTarea.findByPrioridad(prioridad);
    }
    public List<Tarea> findByCompletado(boolean completado){
     return crudTarea.findByCompletado(completado);
    }

    public <S extends Tarea> S save(S s) {
        return crudTarea.save(s);
    }

    public void delete(Tarea tarea) {
        crudTarea.delete(tarea);
    }

}
