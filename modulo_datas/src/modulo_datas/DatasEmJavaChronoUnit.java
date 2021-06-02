package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DatasEmJavaChronoUnit {

	public static void main(String[] args) throws ParseException {

		// Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");

		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());

		System.out.println("Possui " + dias + " dias entre hoje e a data. ");

		long dias2 = ChronoUnit.MONTHS.between(LocalDate.parse("2021-02-01"), LocalDate.now());

		System.out.println("Possui " + dias2 + " meses entre hoje e a data. ");

		long dias3 = ChronoUnit.WEEKS.between(LocalDate.parse("2021-02-01"), LocalDate.now());

		System.out.println("Possui " + dias3 + " semanas entre hoje e a data. ");

	}

}
