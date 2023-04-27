package com.usa.IngSoftware.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity //Entiende que ESTA clase es una tabla
@Data //Genera automaticamente Getters y Setters. Indispensable.
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Llave primaria autoincremental

    private String userName;
    private String password;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "persona")
    private List<Calendario> calendarios;/**/


}
