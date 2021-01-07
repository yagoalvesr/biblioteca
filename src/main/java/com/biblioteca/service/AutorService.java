package com.biblioteca.service;

import com.biblioteca.domain.Autor;
import com.biblioteca.repository.AutorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    AutorDAO autorDAO;

    public List<Autor> listarAutors() {
        return autorDAO.findAll();
    }

    public Autor recuperarAutorPorId(Integer id) {
        return autorDAO.findById(id).get();
    }

    public void salvarAutor(Autor autor) {
        autorDAO.save(autor);
    }
}
