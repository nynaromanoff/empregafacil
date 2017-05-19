package br.com.anhanguera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.entities.TbEstadocivil;

public interface EC extends JpaRepository<TbEstadocivil, Integer> {

}
