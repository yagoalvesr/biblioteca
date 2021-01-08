package com.biblioteca.resource;

import com.biblioteca.domain.Autor;
import com.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Autor>> listarAutors() {
        List<Autor> autorList = autorService.listarAutors();
        return ResponseEntity.ok().body(autorList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Autor> recuperarAutorPorId(@PathVariable Integer id) {
        Autor autor = autorService.recuperarAutorPorId(id);
        return ResponseEntity.ok().body(autor);
    }

}
