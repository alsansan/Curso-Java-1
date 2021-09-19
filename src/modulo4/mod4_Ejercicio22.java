//tomar el ejercicio anterior y realizar un ciclo que se repita 10 veces
//tomando al categorías al azar, lo mismo que el sueldo con valores lógicos.
//a. Utilizar Math.random(), y , utilizar un ciclo while y solamente salir de este cuando el
//resultado este dentro de los correctos
package modulo4;

public class mod4_Ejercicio22 {
	 public static void main( String args[] ) {
		 
		 int i=1;
		 int j=1;
		 
		 while(i<=10) {
			char random_cha = (char)(Math.random()*3 + 'A');
		 	System.out.println(random_cha);
		 	i++;
		 }
		 while(j<=10) {
				int random_int = (int)(Math.random()*1000 + 1000);
			 	System.out.println(random_int);
			 	j++;
		 }
		 
	 }
}
