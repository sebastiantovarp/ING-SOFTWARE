package com.usa.IngSoftware.services;

import com.usa.IngSoftware.entities.Persona;
import com.usa.IngSoftware.repository.CRUDPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private CRUDPersona personaDAO;

    public Optional<Persona> findOne(Long ID) {
        return personaDAO.findById(ID);
    }

    public Optional<Persona> findByID(Long ID) {
        return personaDAO.findById(ID);
    }

    public List<Persona> findAll() {
        return (List<Persona>) personaDAO.findAll();
    }

    public Persona save(Persona persona) {
        return personaDAO.save(persona);
    }

    public void delete(Persona persona) {
        personaDAO.delete(persona);
    }

    public void resetPassword(Persona persona, String newPassword) {
        persona.setPassword(newPassword);
        personaDAO.save(persona);
    }
}
