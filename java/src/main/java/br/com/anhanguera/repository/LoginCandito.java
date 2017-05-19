package br.com.anhanguera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.entities.TbLogincandidato;

public interface LoginCandito extends JpaRepository<TbLogincandidato, Integer> {

}
