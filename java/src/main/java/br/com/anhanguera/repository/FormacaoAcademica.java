package br.com.anhanguera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.entities.TbFormacaoacademica;

public interface FormacaoAcademica extends JpaRepository<TbFormacaoacademica, Integer> {

}
