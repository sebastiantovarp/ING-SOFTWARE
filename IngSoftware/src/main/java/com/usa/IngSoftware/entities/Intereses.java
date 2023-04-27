package com.usa.IngSoftware.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

//Ultima tabla de calendario. Relaciona cada tarea a cada calendario. Relacion muchos a uno
@Entity
@Data
public class Intereses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;


    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonIgnoreProperties("personas")
    private Persona persona;


}






