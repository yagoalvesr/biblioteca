package com.biblioteca.service;

import com.biblioteca.domain.Livro;
import com.biblioteca.repository.LivroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    LivroDAO livroDAO;

    public List<Livro> listarLivros() {
        return livroDAO.findAll();
    }

    public Livro recuperarLivroPorId(Integer id) {
        return livroDAO.findById(id).get();
    }

    public void salvarLivro(Livro livro) {
        livroDAO.save(livro);
    }
}
