package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio5 {
	public static void main(String[] args) {
		System.out.println("ingresa una posición con número:" );
		Scanner sc = new Scanner(System.in);
		byte pos=sc.nextByte();
		if (pos==1)
			System.out.println("Medalla de oro" );
		else if (pos==2)
			System.out.println("Medalla de plata" );
		else if (pos==3)
			System.out.println("Medalla de bronce" );
		else
			System.out.println("Siga intentando" );
			
	}

}
