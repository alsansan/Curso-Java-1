package modelo;

public class Alumno extends persona{
	private int legajo;
	
	public Alumno() {
		super("Alberto","Sanchez");
		legajo=123456;
	}
	
	public Alumno (String pnombre, String papellido, int plegajo) {
		super(pnombre, papellido);
		legajo=plegajo;
	}
	
	

}
