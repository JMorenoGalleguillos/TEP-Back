package com.TEP.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.TEP.demo.model.Empleados;
import com.TEP.demo.repository.EmpleadosRepository;

//indicamos la clase de tipo servicio y permitimos la inyección de dependencias para los empleados
@Service
public class EmpleadosService implements EmpleadosRepository{
	
	//Automatizamos la implementación de la instancia por inyección de dependencias
	@Autowired
	private EmpleadosRepository empleadosRepository;
	
	@Override
	public <S extends Empleados> S save(S entity) {
		return empleadosRepository.save(entity);
	}
	
	//Función que en base a un id de empresa, retorna todos los empleados pertenecientes a esa empresa
	public List<Empleados> findAllEmpleadosByEmpresa(int id){
		List<Empleados> empleadosRespuesta= new ArrayList<>();
		List<Empleados> empleados= empleadosRepository.findAll();
		for (int i=0; i<empleados.size(); i++) {
			if (empleados.get(i).getEmpresa().getId()==id) {
				empleadosRespuesta.add(empleados.get(i));
			}
		}
		return empleadosRespuesta;
	}
	
	
	
	
	//Métodos posibles a implementar en futuro

	@Override
	public <S extends Empleados> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Empleados> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Empleados getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleados getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleados getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleados> findAll() {
		// TODO Auto-generated method stub
		return empleadosRepository.findAll();
	}

	@Override
	public List<Empleados> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Empleados> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Empleados entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Empleados> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleados> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Empleados> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Empleados> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Empleados> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Empleados, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Empleados> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
}
