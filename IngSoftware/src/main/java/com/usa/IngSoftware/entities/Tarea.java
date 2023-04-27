package com.usa.IngSoftware.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

//Ultima tabla de calendario. Relaciona cada tarea a cada calendario. Relacion muchos a uno
@Entity
@Data
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
    private Integer prioridad;
    private Boolean completado;

    @ManyToOne
    @JoinColumn(name = "calendario_id")
    @JsonIgnoreProperties("tareas")
    private Calendario calendario;


}






