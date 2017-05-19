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

import br.com.anhanguera.entities.TbSexo;
import br.com.anhanguera.service.SexoService;

@CrossOrigin
@RestController
public class SexoController {

	@Autowired
	private SexoService service;
	
	@RequestMapping(value="/sexos", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity <List<TbSexo>>getSexo(){
		return ResponseEntity.ok().body(service.getSexos());
		
	}
	
}
