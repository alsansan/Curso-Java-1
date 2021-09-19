//De un empleado se conoce
//a. la categoría: A,B,C
//b. la antigüedad
//c. el sueldo.
//Se quiere determinar el sueldo neto sabiendo que si la antigüedad esta entre
//1 y 5 años se le aumentan un 5% al sueldo bruto.
//6 y 10 años se le aumenta un 10% al sueldo bruto.
//Mas de 10 un 30%
//Y un plus por categoría
//A= 1000, B=2000, c=3000

package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio21 {
	public static void main(String[] args) {
		
		System.out.println("ingresa una categoría:" );
		Scanner sc = new Scanner(System.in);
		char cat = sc.next().charAt(0);
		
		System.out.println("ingresa una antigüedad:" );
		Scanner sc1 = new Scanner(System.in);
		byte ant = sc1.nextByte();
		
		System.out.println("ingresa el sueldo:" );
		Scanner sc2 = new Scanner(System.in);
		int sueldo = sc2.nextInt();
		
		int suma=0;
		double sneto=0;
		
		if (cat=='A')
			suma=sueldo+1000;
		else if (cat=='B')
			suma=sueldo+2000;
		else
			suma=sueldo+3000;
		
		if (ant>=1 && ant<=5)
			sneto=suma+sueldo*0.05;
		else if (ant>=6 && ant<=10)
			sneto=suma+sueldo*0.1;
		else
			sneto=suma+sueldo*0.3;
		System.out.println("El sueldo neto es:" + sneto);
	}
		
			
		

}
