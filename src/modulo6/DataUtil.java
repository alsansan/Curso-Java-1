package modulo6;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;


public class DataUtil {
	
	public DataUtil() {}
	
	public static int getAnio(Date pfecha) {
		Calendar cal= Calendar.getInstance();
		cal.setTime(pfecha);
		return cal.get(Calendar.YEAR);
	}

	public static int getMes(Date pfecha) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(pfecha);
		return cal.get(Calendar.MONTH);
	}
	public static int getDia(Date pfecha) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(pfecha);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	public static boolean isFindeSemana(Date pfecha) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(pfecha);
		int dia=cal.get(Calendar.DAY_OF_WEEK);
		if ((dia==0)||(dia==6))
			return true;
		else
			return false;
	}
	public static boolean isDiadeSemana(Date pfecha) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(pfecha);
		int dia=cal.get(Calendar.DAY_OF_WEEK);
		if ((dia==0)||(dia==6))
			return false;
		else
			return true;
	}
	public static int getDiaDeSemana(Date pfecha) {
		Calendar cal=Calendar.getInstance();
		cal.setTime(pfecha);
		int dia=cal.get(Calendar.DAY_OF_WEEK);
		return dia;
	}
	public static Date asDate(String pattern, String fecha) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = format.parse(fecha);
		return date;		
	}
	public static Calendar asCalendar(String pattern, String fecha) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = format.parse(fecha);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
		
	}
	public static String asString(String pattern, String fecha) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(fecha);
		
	}
	
}
