package com.lemon.listperson.service;

import com.lemon.listperson.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List listar(){
        return personaRepository.findAll();
    }
}
