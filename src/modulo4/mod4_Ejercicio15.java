//realizar un sistema que permita mostrar las características de un auto utilizando para ello una
//variable de tipo char, esta se llenara con los valores ‘a’, ‘b’ o ‘c’, siendo de clase ‘a’ los que
//tienen 4 ruedas y un motor, clase ‘b’ 4 ruedas, un motor, cierre centralizado y aire, y clase ‘c’ 4
//ruedas, un motor, cierre centralizado, aire, airbag.
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio15 {
	public static void main(String[] args) {
		
		System.out.println("ingresa una clase de auto:" );
		Scanner sc = new Scanner(System.in);
		char cla = sc.next().charAt(0);
		switch (cla) {
    		case 'a':
    			System.out.println("4 ruedas y un motor");
    			break;
    		case 'b':
				System.out.println("4 ruedas, un motor, cierre centralizado y aire");
				break;
    		case 'c':
				System.out.println("4 ruedas, un motor, cierre centralizado, aire, airbag");
				break;
			default:
				System.out.println("No es una clase válida");
		}
	}
}
