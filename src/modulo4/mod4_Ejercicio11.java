//Realizar un programa que permita asignarle a una variable de tipo char un caracter, luego
//deberá determinar si este caracter es una vocal o no, realizando esta lógica a través de la unión
//lógica or, ya que las vocales son ‘a’, ‘e’, ‘i’, ‘o’, ‘u’.

package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char let;
		
		System.out.println("Introduzca una letra: " );
		let = sc.next().charAt(0);
		
		if ((let=='a')||(let=='e')||(let=='i')||(let=='o')||(let=='u'))
			System.out.println("El caracter introducido es una vocal: " + let);
		else
			System.out.println("El caracter introducido no es una vocal" );
	}
			

}
