package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDPersona extends CrudRepository<Persona, Long> { //CrudRepository recibe tipo de clase y su llave primaria.

}