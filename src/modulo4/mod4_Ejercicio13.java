//Realizar un programa que permita determinar la cantidad de d�as que tiene el mes informando
//el nombre del mismo acompa�ado de la cantidad de d�as que le corresponden. Recuerde que 30
//d�as tiene noviembre con abril junio y setiembre de 28 solo hay uno y los dem�s 31
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa un mes del a�o en min�scula:" );
	    String mes=sc.nextLine();
	    switch (mes) {
	    	case "enero":
	    		System.out.println("Enero tiene 31 d�as");
	    		break;
	    	case "febrero":
    			System.out.println("Febrero tiene 28 d�as");
    			break;
	    	case "marzo":
    			System.out.println("Marzo tiene 31 d�as");
    			break;
	    	case "abril":
    			System.out.println("Abril tiene 30 d�as");
    			break;
	    	case "mayo":
    			System.out.println("Mayo tiene 31 d�as");
    			break;
	    	case "junio":
    			System.out.println("Junio tiene 30 d�as");
    			break;
	    	case "julio":
    			System.out.println("Julio tiene 31 d�as");
    			break;
	    	case "agosto":
    			System.out.println("Agosto tiene 31 d�as");
    			break;
	    	case "septiembre":
    			System.out.println("Septiembre tiene 30 d�as");
    			break;
	    	case "octubre":
    			System.out.println("Octubre tiene 31 d�as");
    			break;
	    	case "noviembre":
    			System.out.println("Noviembre tiene 30 d�as");
    			break;
    		case "diciembre":
    			System.out.println("Diciembre tiene 31 d�as");
    			break;
    		default:
    			System.out.println("Eso no es un mes");
    			
	    		
	    }
	}
}
