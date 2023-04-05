package com.usa.IngSoftware.controller;

import com.usa.IngSoftware.entities.Tarea;
import com.usa.IngSoftware.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarea")
public class ControladorTarea {

    @Autowired
    private TareaService tareaService;

    @GetMapping("/by-id")
    public Tarea findById(Long id) {
        return tareaService.findById(id);
    }
    @GetMapping("/by-description")
    public List<Tarea> findByDescripcion(String descripcion){
        return tareaService.findByDescripcion(descripcion);
    }
    @GetMapping("/by-priority")
    public List<Tarea> findByPrioridad(int prioridad){
        return tareaService.findByPrioridad(prioridad);
    }
    @GetMapping("/by-completion")
    public List<Tarea> findByCompletado(boolean completado){
        return tareaService.findByCompletado(completado);
    }

    @PostMapping("/save")
    public Tarea save(@RequestBody Tarea t){
        return tareaService.save(t);
    }

    @GetMapping("/delete")

    public void delete(Tarea tarea) {
        tareaService.delete(tarea);
    }
}
