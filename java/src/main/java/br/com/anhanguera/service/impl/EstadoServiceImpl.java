package br.com.anhanguera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbUf;
import br.com.anhanguera.repository.UF;
import br.com.anhanguera.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{
	@Autowired
	private UF estados;

	@Override
	public List<TbUf> getEstados() {
		
		return estados.findAll();
	}
}
