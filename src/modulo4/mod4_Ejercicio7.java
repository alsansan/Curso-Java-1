package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese 3 números enteros y pulse intro:" );

		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		
		if (a>=b && b>=c)
			System.out.println("El mayor es " + a );
		else if (b>=a && a>=c)
			System.out.println("El mayor es " + b );
		else if (a>=c && c>=b)
				System.out.println("El mayor es " + a );
		else if (b>=c && c>=a)
			System.out.println("El mayor es " + b );
		else if (c>=a && a>=b)
			System.out.println("El mayor es " + c );
		else
			System.out.println("El mayor es " + c );
		
			
	}
		
		
		

}
