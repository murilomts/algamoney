package com.estudo.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
