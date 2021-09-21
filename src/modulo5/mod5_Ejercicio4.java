package modulo5;

public class mod5_Ejercicio4 {
	public static void main(String[] args) {
		
		String str1="esto es una prueba de la clase String";
		int numvoc=0;
		int numesp=0;
		int numcon=0;
		
		for (int i=0; i<str1.length();i++) {
			char letra=str1.charAt(i);
			if ((letra=='a')||(letra=='e')||(letra=='i')||(letra=='o')||(letra=='u')) 
				numvoc=numvoc+1;
			else if (letra==' ')
				numesp=numesp+1;
			else
				numcon=numcon+1;
		}
		System.out.println("Numero de vocales=" + numvoc);
		System.out.println("Numero de consonantes=" + numcon);
		System.out.println("Numero de espacios=" + numesp);
		
				
				
	}

}
