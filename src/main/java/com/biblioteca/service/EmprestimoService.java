package com.biblioteca.service;

import com.biblioteca.domain.Emprestimo;
import com.biblioteca.repository.EmprestimoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    EmprestimoDAO emprestimoDAO;

    public List<Emprestimo> listarEmprestimos() {
        return emprestimoDAO.findAll();
    }

    public Emprestimo recuperarEmprestimoPorId(Integer id) {
        return emprestimoDAO.findById(id).get();
    }

    public void salvarEmprestimo(Emprestimo emprestimo) {
        emprestimoDAO.save(emprestimo);
    }
}
