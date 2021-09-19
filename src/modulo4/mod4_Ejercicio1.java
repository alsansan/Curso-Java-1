package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio1 {
	public static void main(String[] args) {
		
		System.out.println("ingresa la nota:" );
	       Scanner sc = new Scanner(System.in);
	       float nota1= sc.nextFloat();
		if (nota1 >= 7)
			System.out.println("El alumno ha aprobado con un: " + nota1);
		else
			System.out.println("Suspenso " + nota1);
			
			
	}

}
