package br.com.anhanguera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbFormacaoacademica;
import br.com.anhanguera.repository.FormacaoAcademica;
import br.com.anhanguera.service.FormacaoAcademicaService;

@Service
public class FormacaoAcademicaServiceImpl implements FormacaoAcademicaService {

	@Autowired
	private FormacaoAcademica formacao;

	@Override
	public List<TbFormacaoacademica> getFormacao_Academica() {
		return formacao.findAll();
	}
	
	
}
