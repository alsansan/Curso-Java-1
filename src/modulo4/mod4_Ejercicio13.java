//Realizar un programa que permita determinar la cantidad de días que tiene el mes informando
//el nombre del mismo acompañado de la cantidad de días que le corresponden. Recuerde que 30
//días tiene noviembre con abril junio y setiembre de 28 solo hay uno y los demás 31
package modulo4;

import java.util.Scanner;

public class mod4_Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingresa un mes del año en minúscula:" );
	    String mes=sc.nextLine();
	    switch (mes) {
	    	case "enero":
	    		System.out.println("Enero tiene 31 días");
	    		break;
	    	case "febrero":
    			System.out.println("Febrero tiene 28 días");
    			break;
	    	case "marzo":
    			System.out.println("Marzo tiene 31 días");
    			break;
	    	case "abril":
    			System.out.println("Abril tiene 30 días");
    			break;
	    	case "mayo":
    			System.out.println("Mayo tiene 31 días");
    			break;
	    	case "junio":
    			System.out.println("Junio tiene 30 días");
    			break;
	    	case "julio":
    			System.out.println("Julio tiene 31 días");
    			break;
	    	case "agosto":
    			System.out.println("Agosto tiene 31 días");
    			break;
	    	case "septiembre":
    			System.out.println("Septiembre tiene 30 días");
    			break;
	    	case "octubre":
    			System.out.println("Octubre tiene 31 días");
    			break;
	    	case "noviembre":
    			System.out.println("Noviembre tiene 30 días");
    			break;
    		case "diciembre":
    			System.out.println("Diciembre tiene 31 días");
    			break;
    		default:
    			System.out.println("Eso no es un mes");
    			
	    		
	    }
	}
}
