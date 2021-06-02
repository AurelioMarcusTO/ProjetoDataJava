package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJavaParcelas {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("10/04/2021");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);

	}

}
