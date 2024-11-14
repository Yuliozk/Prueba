package com.mx.Formulario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Formulario.Model.Empleados;
import com.mx.Formulario.repository.IEmpleados;

@Service
public class EmpleadosService {

	@Autowired
	private IEmpleados repository;
	
	public List<Empleados> getAll(){
		return repository.findAll(Sort.by(Sort.Direction.ASC,"idEmpleado"));
	}
	
	public Empleados save(Empleados emp) {
		return repository.save(emp);
	}
	 public Empleados getEmpleado(int id) {
		 return repository.findById(id).orElse(null);
	 }
	 public void eliminar(Empleados emp) {
		 repository.delete(emp);
	 }
	
}
