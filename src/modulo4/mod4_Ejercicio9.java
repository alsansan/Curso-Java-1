package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=1;
		int b=1;
		
		System.out.println("Juego de piedra, papel o tijera" );
		System.out.println("Piedra=0\tPapel=1\t\tTijera=2" );
		do {
			System.out.println("Jugador 1:" );
			a=sc.nextInt();
		
			System.out.println("Jugador 2:" );
			b=sc.nextInt();
			
			if (a==0 && b==2)
				System.out.println("Gana el jugador 1" );
			else if (a==1 && b==0)
				System.out.println("Gana el jugador 1" );
			else if (a==2 && b==1)
				System.out.println("Gana el jugador 1" );
			else if (b==0 && a==2)
				System.out.println("Gana el jugador 2" );
			else if (b==1 && a==0)
				System.out.println("Gana el jugador 2" );
			else if (b==2 && a==1)
				System.out.println("Gana el jugador 2" );
			else
				System.out.println("Empate" );
				
		}while (a==b);
	}
}

