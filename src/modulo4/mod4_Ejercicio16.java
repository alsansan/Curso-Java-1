//Realizar un programa que permita mostrar en pantalla la tabla de multiplicar de un valor
//ingresado a través de una variable
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio16 {
	public static void main(String[] args) {
		
		System.out.println("ingresa un número:" );
		Scanner sc = new Scanner(System.in);
		int num=sc.nextByte();
		
		for(int i=0;i<=10;i++){
			int tab=num*i;
			System.out.println(num + "x" + i + "=" + tab);
		}
	}
			
		

}
