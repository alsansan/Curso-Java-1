package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("ingresa un mes del a�o en min�scula:" );
	       Scanner sc = new Scanner(System.in);
	       String mes=sc.nextLine();
	       if ((mes.equals("abril"))||(mes.equals("junio"))||(mes.equals("septiembre"))||(mes.equals("noviembre")))
	    	   	System.out.println("El mes " + mes + " tiene 30 d�as");
	       else if ((mes.equals("enero"))||(mes.equals("marzo"))||(mes.equals("mayo"))||(mes.equals("julio"))||(mes.equals("agosto"))||(mes.equals("octubre"))||(mes.equals("diciembre")))
	    	   	System.out.println("El mes " + mes + " tiene 31 d�as");
	       else if (mes.equals("febrero"))
	    	   System.out.println("El mes " + mes + " tiene 28 d�as");
	       else
	    	   System.out.println("El texto introducido no es un mes del a�o");       
	       
	       
	}

}
