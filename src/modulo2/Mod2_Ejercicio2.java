package modulo2;

public class Mod2_Ejercicio2 {
	public static void main(String[] args) {
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = (short) (Math.pow(2,15)*(-1));
		short smax = (short) (Math.pow(2,15)-1);
		int imax = (int) (Math.pow(2, 31)-1);
		int imin = (int) (Math.pow(2, 31)*(-1));
		long lmin = (long) (Math.pow(2, 63)*(-1));
		long lmax = (long) (Math.pow(2, 63)-1);
		System.out.println("byte\t" + bmin + "\t\t\t" + bmax);
		System.out.println("short\t" + smin + "\t\t\t" + smax);
		System.out.println("int\t" + imin + "\t\t" + imax);
		System.out.println("long\t" + lmin + "\t" + lmax);
	}

}
