//Realizar un ciclo do while que muestre 10 números al azar (Math.random() )informando el
//máximo y el mínimo de ellos
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
		System.out.println("El máximo es " + max + " y el mínimo es " + min);
	 }

}
