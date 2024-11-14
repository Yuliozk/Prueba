package com.mx.Formulario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Formulario.Model.Empleados;
import com.mx.Formulario.service.EmpleadosService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path="/Empleados")
@CrossOrigin
public class EmpleadosWS {

	@Autowired
	private EmpleadosService service;
	
	//url: http//localhost:8010/Empleados
	
	@GetMapping
	public ResponseEntity<?> listar(){
		List<Empleados> empleados = service.getAll();
		if (empleados.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(empleados);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(Empleados emp){
		Empleados nuevo = service.save(emp);
		return ResponseEntity.ok(nuevo);
	}
	
	@GetMapping("/{idEmpleado}")
	public ResponseEntity<?> buscar(@PathVariable int idEmpleado) {
		Empleados emp = service.getEmpleado(idEmpleado);
		if (emp != null) {
			return ResponseEntity.ok(emp);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable int id){
		Empleados emp =service.getEmpleado(id);
		if (emp !=null) {
			service.eliminar(emp);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping
	public ResponseEntity<?> editar(@RequestBody Empleados empleado) {
		Empleados editar = service.getEmpleado(empleado.getIdEmpleado());
		if (editar !=null) {
			Empleados editado = service.save(empleado);
			return ResponseEntity.ok(editado);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
}
