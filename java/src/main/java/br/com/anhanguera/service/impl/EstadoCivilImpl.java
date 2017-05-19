package br.com.anhanguera.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbEstadocivil;
import br.com.anhanguera.repository.EC;
import br.com.anhanguera.service.EstadoCivilService;

@Service
public class EstadoCivilImpl implements EstadoCivilService{

	@Autowired
	private EC estadocivil;
	
	@Override
	public List<TbEstadocivil> getEstadoscivil() {
		return estadocivil.findAll();
	}
	

	
}
