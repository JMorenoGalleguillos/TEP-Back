package com.TEP.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Indicamos la existencia de la entidad Empresas
@Entity
//la cual se asocia a la tabla empresas en la BDD
@Table (name = "empresas")
public class Empresas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String direccion;
	private String rut;
	private	String telefono;
	
	//Definición de constructores
	public Empresas(String nombre, String direccion, String rut, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.rut = rut;
		this.telefono = telefono;
	}
	
	public Empresas() {
		
	}
	
	//Definición de getters y setters para la clase empresas
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
}
