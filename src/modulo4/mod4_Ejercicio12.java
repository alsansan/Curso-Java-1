//Realizar un sistema que permita asignar un numero dentro de una variable de tipo int y
//sabiendo que
//a. La primer docena va de 1 a 12
//b. La segunda docena va de 13 a 24
//c. La tercer docena va de 25 a 36
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: " );
		int num = sc.nextInt();
		
		if (num>=1 && num<=12)
			System.out.println("El número pertenece a la primera docena" );
		else if (num>=13 && num<=24)
			System.out.println("El número pertenece a la segunda docena" );
		else if (num>=25 && num<=36)
			System.out.println("El número pertenece a la tercera docena" );
		else 
			System.out.println("Fuera de rango" );
			
			
	}
}
