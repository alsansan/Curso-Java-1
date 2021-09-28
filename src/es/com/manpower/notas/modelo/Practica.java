package es.com.manpower.notas.modelo;

import java.util.List;

public class Practica implements Model{
    private int codigo		;
    private String nombre	;
    
	public Practica() {	}

	public Practica(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Practica(int codigo) {
		super();
		this.codigo=codigo;
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
	//aca va el equals, hashCode y toString
	
	
}
