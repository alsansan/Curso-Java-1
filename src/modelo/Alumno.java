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
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo=legajo;
	}
	public boolean equals(Object obj){		
		return obj instanceof Alumno	 					&&
				super.equals(obj)  							&&
				legajo == ((Alumno)obj).getLegajo();
	}
	public String toString() {
		return super.toString() + ", legajo: " + legajo ;
	}		
	public int hashCode(){
		return super.hashCode() + (int)legajo;
	}
	
	

}
