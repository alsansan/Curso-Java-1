package modelo;

public class persona {
	private String nombre;
	private String apellido;
	
	public persona() {
		nombre="Alberto";
		apellido="Sanchez";
	}
	
	public persona(String pnombre, String papellido) {
		nombre= pnombre;
		apellido=papellido;
	}
	
	public String getApellido() {	return apellido;	}
	public String getNombre() {		return nombre;		}
	
	public void setApellido(String papellido) {	this.apellido=papellido;	}	
	public void setNombre(String pnombre) {	this.nombre=pnombre;	}
	
	public boolean equals (Object obj) {
		boolean bln =false;
		if(obj instanceof persona){
			//downcast			
			persona per = (persona) obj;
			bln = 	this.apellido == per.getApellido() &&
					this.nombre == per.getNombre();
		}
		return bln;
	}
	public int hashCode(){
		return  nombre.hashCode() + apellido.hashCode();
	}
	public String toString(){
		return "nombre: " + nombre + ", apellido: " + apellido;
	
	
	}
	
}
