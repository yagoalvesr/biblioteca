package com.biblioteca.resource;

import com.biblioteca.domain.Emprestimo;
import com.biblioteca.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "emprestimos")
public class EmprestimoController {

    @Autowired
    EmprestimoService emprestimoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Emprestimo>> listarEmprestimos() {
        List<Emprestimo> emprestimoList = emprestimoService.listarEmprestimos();
        return ResponseEntity.ok().body(emprestimoList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Emprestimo> recuperarEmprestimoPorId(@PathVariable Integer id) {
        Emprestimo emprestimo = emprestimoService.recuperarEmprestimoPorId(id);
        return ResponseEntity.ok().body(emprestimo);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> salvarEmprestimo(@RequestBody Emprestimo emprestimo) {
        emprestimoService.salvarEmprestimo(emprestimo);
        return ResponseEntity.ok().body("Emprestimo salvo com sucesso!");
    }
}
