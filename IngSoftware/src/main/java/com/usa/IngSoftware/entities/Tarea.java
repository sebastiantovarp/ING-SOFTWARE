package com.usa.IngSoftware.entities;

//Pese a estar en enitites, esta NO  es una tabla. Hace parte de calendario.
public class Tarea {
    private String descripcion;
    private int nivelPrioridad;
    private boolean completado;

    public Tarea(String descripcion, int nivelPrioridad) {
        this.descripcion = descripcion;
        this.nivelPrioridad = nivelPrioridad;
        this.completado = false;
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}






