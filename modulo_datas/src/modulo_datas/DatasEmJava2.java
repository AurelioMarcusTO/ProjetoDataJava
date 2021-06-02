package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/ 
		
		/*Simular que data vem do banco de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); /*Definindo uma data qualquer*/ 
		
		
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		
		System.out.println("Somando o dia : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("Somando um mes : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando um ano : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		
	}

}
