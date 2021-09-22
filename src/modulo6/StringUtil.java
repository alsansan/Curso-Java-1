package modulo6;

public class StringUtil {
		public static boolean contienedosespacios(String str) {
			String str1 = "gcasas1972@gmail.com";
			if (str1.contains("  ")) 
				return true;
			else
				return false;
		}
		public static boolean contienedigitos(String str) {
			String str2="gcasas1972@gmail.com";
			for (int i=0; i<str2.length(); i++) {
				char caracter=str2.charAt(i-1);
				Character.isDigit(caracter);
			}
			return false;
		}		
}

