//Realizar un ciclo do while que muestre 10 n�meros al azar (Math.random() )informando el
//m�ximo y el m�nimo de ellos
package modulo4;

public class mod4_Ejercicio20 {
	 public static void main( String args[] ) {
		int min=1000;
		int max=0;
		int i=1;
		do {
			 int random_int = (int)(Math.random()*1000);
			 System.out.println(random_int);
			 if (random_int<min)
				 min=random_int;
			 if (random_int>max)
				 max=random_int;
			 i++;
		} while (i<=10);
		System.out.println("El m�ximo es " + max + " y el m�nimo es " + min);
	 }

}
