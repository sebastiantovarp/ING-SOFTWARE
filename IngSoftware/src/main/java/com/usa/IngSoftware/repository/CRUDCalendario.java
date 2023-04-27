package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Calendario;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Date;

public interface CRUDCalendario extends CrudRepository<Calendario, Long> {
    public List<Calendario> findByPersonaIdAndFechaAfterAndFechaBefore(Long id, Date a, Date b);
}
