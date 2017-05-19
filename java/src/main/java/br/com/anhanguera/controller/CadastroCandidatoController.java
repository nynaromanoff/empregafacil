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

import br.com.anhanguera.entities.TbDadospessoaiscandidato;
import br.com.anhanguera.service.CadastroCandidatoService;

@CrossOrigin
@RestController
public class CadastroCandidatoController {
	
	@Autowired
	private CadastroCandidatoService service;
	
	@RequestMapping(value="/cadastro/candidato", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<TbDadospessoaiscandidato> salvarCandidato(@RequestBody TbDadospessoaiscandidato candidato) {
		return ResponseEntity.ok().body(candidato);
		//return ResponseEntity.ok().body(service.salvarCanditado(candidato));
	}

}
