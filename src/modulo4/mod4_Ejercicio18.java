//Realizar dos ciclos for anidados de manera de mostrar todas las tablas
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio18 {
	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++){
			System.out.println("Tabla del "+ i);
			for(int j=0;j<=10;j++ ) {
				int tab=i*j;
				System.out.println(i + "x" + j + "=" + tab);
			}
		}
	}

}
