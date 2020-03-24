package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		// Se usaba antes de Java 7
		/*Date date = new Date();
		
		System.out.println("El día de hoy es:" + date.getDay());*/
		
		// Con Java 7
		Calendar c = Calendar.getInstance();	// si quiero usar un objeto
		
		// Perio puedo trabajar directamente con la clase
		//System.out.println();
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Hoy es: " + c.get(Calendar.DATE) + 
				" del mes " + c.get(Calendar.MONTH) + 
				" del año " + c.get(Calendar.YEAR)); 
		
		System.out.println(c.getWeeksInWeekYear());
		
		// Java 8
		
		LocalDate now = LocalDate.now();
		LocalDate dentro30dias = now.plusDays(30);
		LocalDate birth = LocalDate.of(1950, Month.JULY, 13);
		System.out.println(now);
		System.out.println(dentro30dias);
		System.out.println(birth);
		
		LocalTime now2 = LocalTime.now();
		LocalTime bedTime = LocalTime.of(23, 0);
		LocalTime wakeUp = bedTime.plusHours(8);
		System.out.printf("I will wake up at %02d:%02d", wakeUp.getHour(), wakeUp.getMinute());

		LocalDateTime dateTime = LocalDateTime.now();
		
	}

}
