package com.usa.IngSoftware.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashMap;

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
    private HashMap<Integer, Tarea> MapaHoras;

    //Metodo para crear un mapa de horas vacío para cada calendario.
    public HashMap<Integer, Tarea> iniciarMapa() {
        MapaHoras = new HashMap<>();
        Tarea t;
        // Inicializar el HashMap con 24 horas y valores vacíos por defecto
        for (int i = 0; i < 24; i++) {
            t = new Tarea(" ",0);
            MapaHoras.put(i, t);
        }
        return MapaHoras;
    }

    public HashMap<Integer, Tarea> getHourlyMap() {
        return this.MapaHoras;
    }

    public void setHourlyMap(HashMap<Integer, Tarea> MapaHoras) {
        this.MapaHoras = MapaHoras;
    }

    // Método para agregar un valor a una hora específica del HashMap
    public void addValue(int hour,Tarea tarea) {
        Tarea t = tarea;
        this.MapaHoras.put(hour, t);
    }

    // Método para obtener el valor de una hora específica del HashMap
    public Tarea getValue(int hour) {
        return this.MapaHoras.get(hour);
    }

    //Metodo para crear tareas: recibe toda la info y la hora necesaria.
    public void crearTarea(String descripcion, int prioridad, int hora){
        Tarea t= new Tarea(descripcion,prioridad);
        MapaHoras.put(hora,t);
    }

    public Calendario() {

    }

    public Calendario(Persona persona, Date fecha) {
        this.persona = persona;
        this.fecha = fecha;
        this.MapaHoras= iniciarMapa();
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


}
