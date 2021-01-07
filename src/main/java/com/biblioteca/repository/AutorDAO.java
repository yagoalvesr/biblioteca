package com.biblioteca.repository;

import com.biblioteca.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDAO extends JpaRepository<Autor, Integer> {
}
