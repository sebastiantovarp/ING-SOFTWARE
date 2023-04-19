package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository {

    @Autowired
    private CRUDPersona personaDAO;


    public Optional<Persona> findOne(Long ID) {
        return personaDAO.findById(ID);
    }

    public Optional<Persona> findById(Long ID){
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

