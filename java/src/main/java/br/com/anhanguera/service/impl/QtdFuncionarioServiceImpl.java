package br.com.anhanguera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbQtdfuncionario;
import br.com.anhanguera.repository.QtdFuncionarioRepository;
import br.com.anhanguera.service.QtdFuncionarioService;

@Service
public class QtdFuncionarioServiceImpl implements QtdFuncionarioService {
	
	@Autowired
	private QtdFuncionarioRepository quantidade;

	@Override
	public List<TbQtdfuncionario> getQuantidadeFun() {
		return quantidade.findAll();
	}
	

}
