package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio4 {
	public static void main(String[] args) {
		char cat;
		do { 
			System.out.println("ingresa una categoría, a, b o c:" );
			Scanner sc = new Scanner(System.in);
			cat=sc.next().charAt(0);;
			if (cat=='a')
				System.out.println("hijos");
			else if (cat=='b')
				System.out.println("padres");
			else if (cat=='c')
				System.out.println("abuelos");
			else
				System.out.println("Introduzca una categoría válida");
		} while ((cat!='a')||(cat!='b')||(cat!='c')); 
				
	}

}
