package mx.com.qtx.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaUtil {
	
	public static Date getFecha(int aaaa,int mm,int dd) {
		GregorianCalendar cal = new GregorianCalendar(aaaa,mm -1,dd);
		return cal.getTime();
	}
	
	public static Date getFecha(int aaaa,int mm,int dd, int hrs, int min) {
		GregorianCalendar cal = new GregorianCalendar(aaaa,mm -1,dd, hrs, min);
		return cal.getTime();
	}
	
	public static int calcularEdad(LocalDate ldFecNac, LocalDate ldFecActual) {
	    return Period.between(ldFecNac, ldFecActual)
			    		     .getYears();
	}
	
	public static int calcularEdad(Date fecNac, Date fecAct) {
		LocalDate ldFecNac = dateToLocalDate(fecNac);
		LocalDate ldFecAct = dateToLocalDate(fecAct);
		return calcularEdad(ldFecNac,ldFecAct);
	}
	
	public static int calcularEdad(Date fecNac) {
		System.out.println("FechaUtil.calcularEdad(fecNac:" + fecNac + ")");
		LocalDate ldFecNac = dateToLocalDate(fecNac);
		LocalDate ldFecAct = dateToLocalDate(new Date());
		return calcularEdad(ldFecNac,ldFecAct);
	}
	
	private static LocalDate dateToLocalDate(Date fecha) {
		System.out.println("FechaUtil.dateToLocalDate(fecha:" + fecha + ")");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(fecha);
		LocalDate ldFecha = LocalDate.of(gc.get(GregorianCalendar.YEAR),
				                         (gc.get(GregorianCalendar.MONTH) + 1), 
				                         gc.get(GregorianCalendar.DAY_OF_MONTH));
		return ldFecha;
	}
	
	public static Date agregarMinutosAFecha(Date fecha, int minutos) {
		long milisFecha = fecha.getTime();
		long milisMin = 1000 * 60 * minutos;
		return new Date(milisFecha + milisMin);
	}
	
}
