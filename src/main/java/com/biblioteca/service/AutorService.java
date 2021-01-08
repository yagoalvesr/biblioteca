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

    public Autor salvarAutor(Autor autor) throws Exception {
        Autor autorSalvo;
        try {
            autor.setNome(autor.getNome().toUpperCase());
            autorSalvo = autorDAO.save(autor);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return autorSalvo;
    }
}
