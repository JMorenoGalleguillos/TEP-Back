package com.TEP.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//Indicamos la existencia de la entidad Empleados
@Entity
//la cual se encuentra asociada a la tabla empleados de la BDD
@Table (name = "empleados")
public class Empleados {
	
	//Indicamos que es un id auto-incremental
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//el atributo nombreCompleto estará asociado a nombre_completo en la BDD
	@Column (name = "nombre_completo")
	private String nombreCompleto;
	private String rut;
	private String email;
	
	//una empresa puede estar asociada a muchos empleados
	@ManyToOne
	@JoinColumn (name="id_empresa")
	private Empresas empresa;
	
	//Definición de constructores
	public Empleados(String nombreCompleto, String rut, String email, Empresas empresa) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.rut = rut;
		this.email = email;
		this.empresa = empresa;
	}
	
	public Empleados() {
	}

	//Definición de getters y setters para la clase Empleados
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}
	
	
	
}
