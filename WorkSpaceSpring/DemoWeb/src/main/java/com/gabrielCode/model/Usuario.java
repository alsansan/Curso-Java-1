package com.gabrielCode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private int codigo;
	@Column(name = "USR_NOMBRE", length = 50)
	private String nombre;
	@Column(name = "USR_CLAVE", length = 255)
	private String clave;
	
	
	public Usuario() { }
	
	public Usuario(int pCodigo, String pNombre, String pClave) {
		codigo = pCodigo;
		nombre = pNombre;
		clave = pClave;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}