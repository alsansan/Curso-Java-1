package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("ingresa un n�mero entero:" );
	       Scanner sc = new Scanner(System.in);
	       int num=sc.nextInt();
	       if (num%2==0)
	    	   System.out.println("El n�mero " + num + " es par");
	       else
	    	   System.out.println("El n�mero " + num + " es impar");
	        
	}
	

}
