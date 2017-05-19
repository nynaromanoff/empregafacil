package br.com.anhanguera.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbDadosempresa;
import br.com.anhanguera.repository.CadastroEmpresaRepository;
import br.com.anhanguera.service.CadastroEmpresaService;

@Service
public class CadastroEmpresaServiceImpl implements CadastroEmpresaService {

	@Autowired
	private CadastroEmpresaRepository cadastroEmpresa;
	
	@Override
	public TbDadosempresa salvarEmpresa(TbDadosempresa empresa) {
		return cadastroEmpresa.save(empresa);
	}
	

}
