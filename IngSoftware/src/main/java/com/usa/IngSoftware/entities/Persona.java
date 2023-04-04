package com.usa.IngSoftware.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity //Entiende que ESTA clase es una tabla
@Data //Genera automaticamente Getters y Setters. Indispensable.
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID; //Llave primaria autoincremental

    private String UserName;
    private String password;



}
