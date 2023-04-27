package com.usa.IngSoftware.repository;

import com.usa.IngSoftware.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepositoryImpl {

    @Autowired
    private PersonaRepository personaDAO;


    public Optional<Persona> findOne(Long ID) {
        return personaDAO.findById(ID);
    }

    public Optional<Persona> findByID(Long ID) {
        return personaDAO.findById(ID);
    }


    public List<Persona> findAll() {
        return (List<Persona>) personaDAO.findAll();
    }


    public void save(Persona persona) {
        personaDAO.save(persona);
    }


    public void delete(Persona persona) {
        personaDAO.delete(persona);
    }


    public void resetPassword(Persona persona, String newPassword) {
        persona.setPassword(newPassword);
        personaDAO.save(persona);
    }
}

