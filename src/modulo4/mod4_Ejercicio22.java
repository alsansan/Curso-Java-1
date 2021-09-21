//tomar el ejercicio anterior y realizar un ciclo que se repita 10 veces
//tomando al categorías al azar, lo mismo que el sueldo con valores lógicos.
//a. Utilizar Math.random(), y , utilizar un ciclo while y solamente salir de este cuando el
//resultado este dentro de los correctos
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio22 {
	 public static void main( String args[] ) {
		 
		 int i=1;
		 
		 while(i<=10) {
			char cat = (char)(Math.random()*3 + 'A');
		 	System.out.println(cat);

			int sueldo = (int)(Math.random()*1000 + 1000);
			System.out.println(sueldo);
			
			System.out.println("ingresa una antigüedad:" );
			Scanner sc1 = new Scanner(System.in);
			byte ant = sc1.nextByte();
			
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
			
			i++;
		 }
		 
		 
	 }
}
