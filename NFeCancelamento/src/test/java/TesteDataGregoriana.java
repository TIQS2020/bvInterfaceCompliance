import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.compliance.nfe.util.DateUtil;

public class TesteDataGregoriana {
	
	public static void main (String[] args){
		
		Integer dataJuliana = new Integer(116161);
		DateUtil dateUtil = new DateUtil();		
		
		Date dataCancel = dateUtil.getDateFormated(dateUtil.julianToRegular(dataJuliana.toString()));
		Calendar calendar = dateUtil.dateToCalendar(dataCancel);		
		
		Date dataCalendar = calendar.getTime();
		
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatadaCalendar = sdf.format(dataCalendar);
		
		System.out.println("Data Formatada Calendar: " + dataFormatadaCalendar);
		
		/*
		
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatada = sdf.format(dateUtil.getDateFormated(dateUtil.julianToRegular(dataJuliana.toString())));
		System.out.println("Data Formatada: " + dataFormatada);
		
		Calendar calendar = dateUtil.dateToCalendar(dateUtil.getDateFormated(dateUtil.julianToRegular(dataJuliana.toString())));
		
		Date dataCalendar = calendar.getTime();
		
		String dataFormatadaCalendar = sdf.format(dataCalendar);
		
		System.out.println("Data Formatada Calendar: " + dataFormatadaCalendar);
		*/
	}

}
