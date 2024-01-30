package exercicios;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {
		
		//Usado para formatar podendo passar o formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Data do sistema
		LocalDate d01 = LocalDate.now();
		
		//Data do sistema com hora
		LocalDateTime d02 = LocalDateTime.now();
		
		//Data do sistema com fuso horário de Londres
		Instant d03 = Instant.now();
		
		//Texto ISO 8601 e gerar data a partir dele
		LocalDate d04 = LocalDate.parse("2023-12-05");
		
		//Texto ISO 8601 e gerar data-hora a partir dele
		LocalDateTime d05 = LocalDateTime.parse("2023-12-05T22:10:00");
		
		//Texto ISO 8601 com fuso horário de Londres
		Instant d06 = Instant.parse("2023-12-05T22:10:00Z");
		
		//Texto ISO 8601 especificando um timezone
		Instant d07 = Instant.parse("2023-12-05T22:10:00-03:00");
		
		//Texto no formato customizado para virar data-hora
		LocalDate d08 = LocalDate.parse("05/12/2023", fmt1);
		/*Pode ser feito assim também: 
		 * LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		*/
		LocalDateTime d09 = LocalDateTime.parse("05/12/2023 01:30", fmt2);
		/*Pode ser feito assim também: 
		 * LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		*/
		
		LocalDate d10 = LocalDate.of(2023, 12, 05);
		
		LocalDateTime d11 = LocalDateTime.of(2023, 12, 05, 1, 30);
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
		

	}

}
