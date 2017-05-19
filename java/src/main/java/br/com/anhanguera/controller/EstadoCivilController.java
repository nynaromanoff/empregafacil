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
import br.com.anhanguera.entities.TbEstadocivil;
import br.com.anhanguera.service.EstadoCivilService;

@CrossOrigin
@RestController
public class EstadoCivilController {

	@Autowired
	private EstadoCivilService service;
	
	@RequestMapping(value="/estadoscivis", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<List<TbEstadocivil>>getEC(){
		return ResponseEntity.ok().body(service.getEstadoscivil());
	}
}
