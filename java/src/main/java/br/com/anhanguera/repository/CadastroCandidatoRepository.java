package br.com.anhanguera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anhanguera.entities.TbDadospessoaiscandidato;

public interface CadastroCandidatoRepository extends JpaRepository<TbDadospessoaiscandidato, Integer> {

}
