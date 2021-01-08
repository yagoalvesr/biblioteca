package com.biblioteca.resource;

import com.biblioteca.domain.Livro;
import com.biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Livro>> listarLivros() {
        List<Livro> livroList = livroService.listarLivros();
        return ResponseEntity.ok().body(livroList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Livro> recuperarLivroPorId(@PathVariable Integer id) {
        Livro livro = livroService.recuperarLivroPorId(id);
        return ResponseEntity.ok().body(livro);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> salvarLivro(@RequestBody Livro livro) throws Exception {
        livroService.salvarLivro(livro);
        return ResponseEntity.ok().body("Livro salvo com sucesso!");
    }
}
