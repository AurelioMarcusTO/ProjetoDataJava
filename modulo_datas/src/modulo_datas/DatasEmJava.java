package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
	
	Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");
	
	/*A data do vencimento é posterior a data atual*/
	if (dataVencimentoBoleto.after(dataAtualHoje)) {
		System.out.println("O boleto não esta vencido ! ");
	}else {
		System.out.println("O boleto esta vencido !");
	}
	
	/*A data Atual é depois da data do vencimento*/
	if (dataAtualHoje.before(dataVencimentoBoleto)) {
		System.out.println("O boleto não esta vencido ! ");
	}else {
		System.out.println("O boleto esta vencido !");
	}

	}

}
