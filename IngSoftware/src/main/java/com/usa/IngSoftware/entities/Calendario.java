package com.usa.IngSoftware.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    private Date fecha;
    private int hora;
    private String [][] tarea;
    public Calendario() {

    }

    public Calendario(Persona persona, Date fecha) {
        this.persona = persona;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String[][] getTarea() {
        return tarea;
    }

    public void setTarea(String[][] tarea) {
        this.tarea = tarea;
    }
}
