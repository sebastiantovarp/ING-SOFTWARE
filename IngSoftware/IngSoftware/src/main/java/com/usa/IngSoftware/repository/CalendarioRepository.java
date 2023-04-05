package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class CalendarioRepository {

    @Autowired
    private CRUDCalendario crudCalendario;


    public List<Calendario> getCalendars(Long id, Date a, Date b){
        return crudCalendario.findByPersonaIdAndFechaAfterAndFechaBefore(id,a,b);
    }

    public Optional<Calendario> findById(Long id) {
        return crudCalendario.findById(id);
    }


    public List<Calendario> findAll() {
        return (List<Calendario>) crudCalendario.findAll();
    }


    public <S extends Calendario> S save(S s) {
        return crudCalendario.save(s);
    }


    public void delete(Calendario calendario) {
        crudCalendario.delete(calendario);
    }


}
