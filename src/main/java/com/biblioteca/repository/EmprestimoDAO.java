package com.biblioteca.repository;

import com.biblioteca.domain.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoDAO extends JpaRepository<Emprestimo, Integer> {
}
