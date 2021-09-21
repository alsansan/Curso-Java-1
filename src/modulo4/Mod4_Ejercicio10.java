package modulo4;

import java.util.Scanner;

public class Mod4_Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese 3 números enteros y pulse intro:" );

		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		
		if ((a>=b && b>=c)||(a>=c && c>=b))
			System.out.println("El mayor es " + a );
		else if ((b>=a && a>=c)||(b>=c && c>=a))
			System.out.println("El mayor es " + b );
		else
			System.out.println("El mayor es " + c );
		
			
	}
		
		
		

}