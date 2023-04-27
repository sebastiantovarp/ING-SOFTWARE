package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Intereses;
import org.springframework.data.repository.CrudRepository;


public interface CRUDIntereses extends CrudRepository<Intereses, Long> { //CrudRepository recibe tipo de clase y su llave primaria.

}