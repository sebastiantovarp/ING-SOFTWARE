package com.usa.IngSoftware.services;

import com.usa.IngSoftware.entities.Tarea;
import com.usa.IngSoftware.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public void crearTarea(Tarea tarea) {
        tareaRepository.save(tarea);
    }

    public Tarea findById(Long id) {
        return tareaRepository.findById(id);
    }
    public List<Tarea> findByDescripcion(String descripcion){
        return tareaRepository.findByDescripcion(descripcion);
    }
    public List<Tarea> findByPrioridad(int prioridad){
        return tareaRepository.findByPrioridad(prioridad);
    }
    public List<Tarea> findByCompletado(boolean completado){
        return tareaRepository.findByCompletado(completado);
    }

    public <S extends Tarea> S save(S s) {
        return tareaRepository.save(s);
    }

    public void delete(Tarea tarea) {
        tareaRepository.delete(tarea);
    }

}
