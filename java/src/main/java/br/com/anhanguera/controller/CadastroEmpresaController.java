package br.com.anhanguera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.anhanguera.entities.TbDadosempresa;
import br.com.anhanguera.service.CadastroEmpresaService;

@CrossOrigin
@RestController
public class CadastroEmpresaController {

	@Autowired
	private CadastroEmpresaService service;
	
	@RequestMapping(value="/cadastro/empresa", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<TbDadosempresa> salvarEmpresa(@RequestBody TbDadosempresa empresa){
		return ResponseEntity.ok().body(empresa);
		//return ResponseEntity.ok().body(service.salvarEmpresa(empresa));
	}
}
