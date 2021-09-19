//Realizar un ciclo while que muestre 10 números al azar informando su suma y su promedio
package modulo4;

public class mod4_Ejercicio19 {
	 public static void main( String args[] ) {
	      int i=1;
	      int suma=0;
	      double promedio;
	      
	      while (i<=10) {
	    	  int random_int = (int)(Math.random()*1000);
	    	  System.out.println(random_int);
	    	  suma=suma+random_int;
	    	  i++;
	      }
	      promedio=suma/10.0;
	      System.out.println("La suma es: " + suma);
	      System.out.println("El promedio es: " + promedio);
	 }
}
	    	 
