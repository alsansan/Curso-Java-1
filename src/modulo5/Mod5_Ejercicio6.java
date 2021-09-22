package modulo5;

public class Mod5_Ejercicio6 {
	public static void main (String[] args) {
		
		String str = "gcasas1972@gmail.com";
		if(str.matches(".*\\d.*"))
			System.out.println("Contiene un número");
		else
			System.out.println("No contiene un número");
	}
}
