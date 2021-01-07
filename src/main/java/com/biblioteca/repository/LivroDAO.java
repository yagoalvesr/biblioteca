package com.biblioteca.repository;

import com.biblioteca.domain.Livro;
import com.biblioteca.domain.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroDAO extends JpaRepository<Livro, Integer> {
}
