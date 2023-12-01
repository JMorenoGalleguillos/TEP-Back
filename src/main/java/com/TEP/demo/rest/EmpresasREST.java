package com.TEP.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TEP.demo.model.Empresas;
import com.TEP.demo.service.EmpresasService;

//Indicamos que devolveremos datos
@RestController
//Con esto indicamos la URL base para acceder al método
@RequestMapping ("/empresas/")
public class EmpresasREST {
	
	//Automatizamos la implementación de la instancia (Inyección)
	@Autowired
	private EmpresasService empresasService;
	
	//Mapeo de solicitud para HTTP GET sin parámetros
	@GetMapping
	//Método para obtener todas las empresas creadas en la BDD
	private ResponseEntity<List<Empresas>> getAllEmpreas(){
		return ResponseEntity.ok(empresasService.findAll());
	}
	
	//Indicamos que la solicitud es un post con un body obligatorio
	@PostMapping
	private ResponseEntity<Empresas> saveEmpresas (@RequestBody Empresas empresas){
		
		//Creamos una manejo de excepción en caso de ocurrir un error al crear una empresa
		try {			
			Empresas guardarEmpresas = empresasService.save(empresas);
			return ResponseEntity.created(new URI("/empresas/"+guardarEmpresas.getId())).body(guardarEmpresas);			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
