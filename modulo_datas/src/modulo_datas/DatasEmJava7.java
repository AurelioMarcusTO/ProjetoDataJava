package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias: " + dataBase.plusDays(5));
		
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));
		
		System.out.println("Menos 5 dias: " + (dataBase = dataBase.minusDays(5)));
		
		for (int data = 1; data <= 12; data ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Data " + data + " vencimento é : " +
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		}

	}

}
