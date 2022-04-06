package br.com.compliance.nfe.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	public String julianToRegular(String j){		
	    Date date;
	    String g = "";
		try {
			date = new SimpleDateFormat("Myydd").parse(j);
			g = new SimpleDateFormat("dd-MM-yyyy").format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}	   
	    return g;
	}
	
	/*hora para aplicativo da compliance*/
	public String getCurrentTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public Calendar dateToCalendar(Date date){ 
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(date);
	  return cal;
	}
	
	/*data para aplicativo da compliance*/
	public Date getDateFormated(String dateFormat){
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");		
		Date date = null;
		try {
			date = sdf.parse(dateFormat);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public String getCurrentDateStr(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf.format(new Date()); 
		return date;
	}
	
	public static String getTimetoJDE(Date data){
		SimpleDateFormat sdfHorario = new SimpleDateFormat("HHmmss");
		String horarioFormatado = sdfHorario.format(data);
		
		return horarioFormatado;
	}
	
	public static int convertToJulian(Date data) {		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String dataFormatada = sdf.format(data);
			
		int resultJulian = 0;
		if (dataFormatada.length() > 0) {
			/* Days of month */
			int[] monthValues = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			String dayS, monthS, yearS;
			dayS = dataFormatada.substring(0, 2);
			monthS = dataFormatada.substring(3, 5);
			yearS = dataFormatada.substring(6, 10);

			/* Convert to Integer */
			int day = Integer.valueOf(dayS);
			int month = Integer.valueOf(monthS);
			int year = Integer.valueOf(yearS);

			// Leap year check
			if (year % 4 == 0) {
				monthValues[1] = 29;
			}
			// Start building Julian date
			String julianDate = "1";
			// last two digit of year: 2016 ==> 16
			julianDate += yearS.substring(2, 4);

			int julianDays = 0;
			for (int i = 0; i < month - 1; i++) {
				julianDays += monthValues[i];
			}
			julianDays += day;

			if (String.valueOf(julianDays).length() < 2) {
				julianDate += "00";
			}else if (String.valueOf(julianDays).length() < 3) {
				julianDate += "0";
			}

			julianDate += String.valueOf(julianDays);
			resultJulian = Integer.valueOf(julianDate);
		}
		return resultJulian;
	}
	
	

}
