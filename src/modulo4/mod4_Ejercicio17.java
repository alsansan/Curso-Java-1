//suma de los valores pares
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio17 {
	public static void main(String[] args) {
		
		System.out.println("ingresa un número:" );
		Scanner sc = new Scanner(System.in);
		int num=sc.nextByte();
		long suma=0;
		for(int i=0;i<=10;i++){
			int tab=num*i;
			System.out.println(num + "x" + i + "=" + tab);
			if (tab%2==0)
				suma=suma+tab;
		}
		System.out.println("La suma de los pares es: " + suma );
	
	}
}
