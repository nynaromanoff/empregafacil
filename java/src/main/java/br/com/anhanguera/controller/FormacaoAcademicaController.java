package br.com.anhanguera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.anhanguera.entities.TbFormacaoacademica;
import br.com.anhanguera.service.FormacaoAcademicaService;

@CrossOrigin
@RestController
public class FormacaoAcademicaController {
	
	@Autowired
	private FormacaoAcademicaService service;
	
	@RequestMapping(value="/formacaoacademica", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<List<TbFormacaoacademica>>getFormacaoAcademica(){
		return ResponseEntity.ok().body(service.getFormacao_Academica());
		
	}
}
