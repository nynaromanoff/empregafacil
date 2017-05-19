package br.com.anhanguera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.entities.TbUf;

public interface UF extends JpaRepository<TbUf, Integer> {

}
