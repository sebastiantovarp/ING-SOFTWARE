package com.usa.IngSoftware.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonIgnoreProperties("calendarios")
    private Persona persona;
    private Date fecha;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "calendario")
    private List<Tarea> tareas;/**/



    //Metodo para crear un mapa de horas vacío para cada calendario.



    // Método para agregar un valor a una hora específica del HashMap


    // Método para obtener el valor de una hora específica del HashMap



}
