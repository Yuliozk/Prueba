package com.mx.Formulario.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Formulario.Model.Empleados;

public interface IEmpleados extends JpaRepository<Empleados, Integer> {


}
