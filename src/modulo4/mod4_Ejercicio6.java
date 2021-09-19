package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio6 {
	public static void main(String[] args) {
		System.out.println("ingrese la edad:" );
		Scanner sc = new Scanner(System.in);
		int edad=sc.nextInt();
		if (edad==0)
			System.out.println("Jardín de infantes" );
		else if (edad>=1 && edad<=6)
			System.out.println("Primaria" );
		else if (edad>=7 && edad<=12)
			System.out.println("Secundaria" );
		else
			System.out.println("Demasiado viejo pa ir a la escuela" );
	}

}
