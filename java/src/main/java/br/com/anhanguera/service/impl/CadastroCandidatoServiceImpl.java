package br.com.anhanguera.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbDadospessoaiscandidato;
import br.com.anhanguera.repository.CadastroCandidatoRepository;
import br.com.anhanguera.service.CadastroCandidatoService;


@Service
public class CadastroCandidatoServiceImpl implements CadastroCandidatoService {
	
	@Autowired
	private CadastroCandidatoRepository cadastro;
	
	
	@Override
	public TbDadospessoaiscandidato salvarCanditado(TbDadospessoaiscandidato candidato) {
		return cadastro.save(candidato);
	}

}
