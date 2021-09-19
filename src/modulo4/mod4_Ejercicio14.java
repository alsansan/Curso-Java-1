//Realizar un programa que permita identificar con una variable de tipo entero el puesto que
//ocupa un torneo, existen 3 posiciones que son premiadas para los cuales deberá mostrar el
//siguiente mensaje en pantalla:

package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio14 {
	public static void main(String[] args) {
		
		System.out.println("ingresa una posición con número:" );
		Scanner sc = new Scanner(System.in);
		byte pos=sc.nextByte();
		switch (pos) {
    		case 1:
    			System.out.println("Medalla de oro");
    			break;
    		case 2:
				System.out.println("Medalla de plata");
				break;
    		case 3:
				System.out.println("Medalla de bronce");
				break;
			default:
				System.out.println("Siga probando");
				
		}
	}

}
