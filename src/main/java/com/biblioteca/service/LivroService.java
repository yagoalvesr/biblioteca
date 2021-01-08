package com.biblioteca.service;

import com.biblioteca.domain.Autor;
import com.biblioteca.domain.Livro;
import com.biblioteca.repository.LivroDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    LivroDAO livroDAO;

    @Autowired
    AutorService autorService;

    public List<Livro> listarLivros() {
        return livroDAO.findAll();
    }

    public Livro recuperarLivroPorId(Integer id) {
        return livroDAO.findById(id).get();
    }

    public void salvarLivro(Livro livro) throws Exception {
        livro.setNome(livro.getNome().toUpperCase());
        Autor autorSalvo = autorService.salvarAutor(livro.getAutor());
        livro.setAutor(autorSalvo);
        livroDAO.save(livro);
    }
}
