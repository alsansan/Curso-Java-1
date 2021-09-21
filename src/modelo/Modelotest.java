package modelo;

import javax.swing.SingleSelectionModel;

public class Modelotest {
	public static void main(String[] args) {
		//crea un objeto
		persona p1 = new Alumno();
		persona p2 = new Alumno("Noa","Camañ",32143412);
		persona p3 = new Profesor("Gabriel", "Casas", "abcd");
		
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);
		System.out.println("p2=" + p3);
		//probando que el contructor funciona
		//c1 = null;
		System.out.println("se creó la persona 1=: " + p1.getNombre());
		System.out.println("su apellido es " + p1.getApellido());
	
		System.out.println("\nse creó la persona 2: " + p2.getNombre());
		System.out.println("su apellido es " + p2.getApellido());
		
		System.out.println("\nse creó la persona 3=: " + p3.getNombre());
		System.out.println("su apellido es " + p3.getApellido());
		
		
	}

}
