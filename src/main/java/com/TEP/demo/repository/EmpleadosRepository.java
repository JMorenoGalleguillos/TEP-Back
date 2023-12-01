package com.TEP.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TEP.demo.model.Empleados;

//Definimos el contrato para los empleados en donde utilizaremos principalmente find y save
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}
