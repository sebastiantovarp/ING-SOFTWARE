package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Intereses;
import com.usa.IngSoftware.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InteresesRepository {

    @Autowired
    private CRUDIntereses crudIntereses;


    public void crearInteres(Intereses intereses) {
        crudIntereses.save(intereses);
    }

    public Intereses findById(Long id) {
        return crudIntereses.findById(id).orElse(null);
    }

    public <S extends Intereses> S save(S s) {
        return crudIntereses.save(s);
    }

    public void delete(Intereses intereses) {
        crudIntereses.delete(intereses);
    }

}
