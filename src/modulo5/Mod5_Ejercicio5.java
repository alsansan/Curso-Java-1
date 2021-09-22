package modulo5;

public class Mod5_Ejercicio5 {
	public static void main(String[] args) {
		
		String str = "gcasas1972@gmail.com";
		for (int i=1; i<=str.length();i++) {
			char letra=str.charAt(i-1);
			if (letra=='@')
				System.out.println("La posición es " + i);
		}
		String str2=str.substring(0, 10);
		String str3=str.substring(11);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
