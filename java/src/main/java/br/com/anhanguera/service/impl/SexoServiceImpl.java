package br.com.anhanguera.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.anhanguera.entities.TbSexo;
import br.com.anhanguera.repository.Sexo;
import br.com.anhanguera.service.SexoService;

@Service
public class SexoServiceImpl implements SexoService {

	private Sexo sexos;
	
	@Override
	public List<TbSexo> getSexos() {
		return sexos.findAll();
	}
	

}
