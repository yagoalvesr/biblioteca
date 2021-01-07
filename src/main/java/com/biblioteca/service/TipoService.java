package com.biblioteca.service;

import com.biblioteca.domain.Tipo;
import com.biblioteca.repository.TipoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoService {

    @Autowired
    TipoDAO tipoDAO;

    public List<Tipo> listarTipos() {
        return tipoDAO.findAll();
    }

    public Tipo recuperarTipoPorId(Integer id) {
        return tipoDAO.findById(id).get();
    }

    public void salvarTipo(Tipo tipo) {
        tipoDAO.save(tipo);
    }
}
