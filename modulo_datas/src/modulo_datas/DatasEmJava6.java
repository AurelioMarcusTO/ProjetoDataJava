package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava6 {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.parse("2019-10-05"); 
		
		LocalDate dataNova = LocalDate.parse("2021-10-10");
		
		System.out.println("A data antiga é antes da Nova:" +dataAntiga.isAfter(dataNova));
		
		System.out.println("A data antiga é depois da Nova:" +dataAntiga.isBefore(dataNova));
		
		System.out.println("A data sao iguais:" +dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Qts dias tem entre: " + periodo.getDays());
		
		System.out.println("Qts meses tem entre: " + periodo.getMonths());
		
		System.out.println("Total de meses entre: " + periodo.toTotalMonths());
		
	}

}
