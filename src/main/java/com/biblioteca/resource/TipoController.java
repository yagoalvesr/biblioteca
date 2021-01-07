package com.biblioteca.resource;

import com.biblioteca.domain.Tipo;
import com.biblioteca.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "tipos")
public class TipoController {

    @Autowired
    TipoService tipoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Tipo>> listarTipos() {
        List<Tipo> tipoList = tipoService.listarTipos();
        return ResponseEntity.ok().body(tipoList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Tipo> recuperarTipoPorId(@PathVariable Integer id) {
        Tipo tipo = tipoService.recuperarTipoPorId(id);
        return ResponseEntity.ok().body(tipo);
    }
}
