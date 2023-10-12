package org.example;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args) {
		/*String date = "10.10.2023";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		dateTimeFormatter2.parse(date);
		LocalDate localDate2 = LocalDate.parse(date, dateTimeFormatter2);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy");
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy HH:mm:ss");
		LocalDate localDate = LocalDate.of(2021, Month.AUGUST, 23);
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(Instant.now().getNano());*/
	/*	System.out.println(dateTimeFormatter.format(localDate));
		System.out.println(zonedDateTime);
		System.out.println(dateTimeFormatter.format(localDateTime));*/

		LocalDate localDate = LocalDate.of(2020, Month.AUGUST, 23);
		LocalDate now = LocalDate.now();

		long days = ChronoUnit.YEARS.between(localDate, now);
		long months = ChronoUnit.MONTHS.between(localDate, now);
		boolean isLeapYear = localDate.isLeapYear();
		System.out.println("Es sind bereits " + days + " Jahre und " + months + " Monate vergangen.");
		System.out.println(isLeapYear);
		System.out.println((months / 12) + " Jahre und " + (months % 12) + " Monate");

	}
}