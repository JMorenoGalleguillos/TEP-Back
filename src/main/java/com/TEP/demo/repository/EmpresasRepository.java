package com.TEP.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TEP.demo.model.Empresas;

//Definimos el contrato para las empresas en donde utilizaremos principalmente find y save
public interface EmpresasRepository extends JpaRepository<Empresas, Integer> {

}
