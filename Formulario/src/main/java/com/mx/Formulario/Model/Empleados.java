package com.mx.Formulario.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Empleados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmpleado;
	private String nombre;
	private String aPaterno;
	private String aMaterno;
	private String curp;
	private int telefono;
	
	
	
	public Empleados() {

	}
	public Empleados(int idEmpleado, String nombre, String aPaterno, String aMaterno, String curp, int telefono) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.curp = curp;
		this.telefono = telefono;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Empleados [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno="
				+ aMaterno + ", curp=" + curp + ", telefono=" + telefono + "]";
	}
	
	
}
