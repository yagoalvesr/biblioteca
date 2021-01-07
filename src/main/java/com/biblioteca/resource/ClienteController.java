package com.biblioteca.resource;

import com.biblioteca.domain.Cliente;
import com.biblioteca.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clienteList = clienteService.listarClientes();
        return ResponseEntity.ok().body(clienteList);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> recuperarClientePorId(@PathVariable Integer id) {
        Cliente cliente = clienteService.recuperarClientePorId(id);
        return ResponseEntity.ok().body(cliente);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> salvarCliente(@RequestBody Cliente cliente) {
        clienteService.salvarCliente(cliente);
        return ResponseEntity.ok().body("Cliente salvo com sucesso!");
    }
}
