package com.TEP.demo.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TEP.demo.model.Empleados;
import com.TEP.demo.service.EmpleadosService;

//Indicamos que devolveremos datos
@RestController
//Con esto indicamos la URL base para acceder al método
@RequestMapping ("/empleados/")
public class EmpleadosREST {

	//Automatizamos la implementación de la instancia (Inyección)
	@Autowired
	private EmpleadosService empleadosService;
	
	//Mapeo de solicitud para HTTP GET con ID
	@GetMapping ("{id}")
	//Método para obtener todos los empleados creadas en la BDD en base a un id específico 
	private ResponseEntity<List<Empleados>> getAllEmpleadosByEmpresa (@PathVariable("id") int id){
		return ResponseEntity.ok(empleadosService.findAllEmpleadosByEmpresa(id));
	}
	
	@GetMapping
	private ResponseEntity<List<Empleados>> getAllEmpleados(){
		return ResponseEntity.ok(empleadosService.findAll());
	}
	
	//Indicamos que la solicitud es un post con un body obligatorio
		@PostMapping
		private ResponseEntity<Empleados> saveEmpleados (@RequestBody Empleados empleados){
			
			//Creamos una manejo de excepción en caso de ocurrir un error al crear un empleado
			try {			
				Empleados guardarEmpleados = empleadosService.save(empleados);
				return ResponseEntity.created(new URI("/empleados/"+guardarEmpleados.getId())).body(guardarEmpleados);			
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}
	
}
