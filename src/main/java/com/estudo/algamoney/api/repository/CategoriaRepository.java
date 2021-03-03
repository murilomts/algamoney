package com.estudo.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
