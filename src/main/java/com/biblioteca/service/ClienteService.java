package com.biblioteca.service;

import com.biblioteca.domain.Cliente;
import com.biblioteca.repository.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteDAO clienteDAO;

    public List<Cliente> listarClientes() {
        return clienteDAO.findAll();
    }

    public Cliente recuperarClientePorId(Integer id) {
        return clienteDAO.findById(id).get();
    }

    public void salvarCliente(Cliente cliente) {
        cliente.setNome(cliente.getNome().toUpperCase());
        clienteDAO.save(cliente);
    }
}
