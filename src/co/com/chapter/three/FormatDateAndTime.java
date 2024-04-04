package co.com.chapter.three;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateAndTime {
	public static void main (String args[]) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek()); 
		System.out.println(date.getMonth()); 
		System.out.println(date.getYear()); 
		System.out.println(date.getDayOfYear());
		System.out.println("-----------");
		FormatDateAndTime.formatedDate();
		System.out.println("-----------");
		FormatDateAndTime.formateShort();
		System.out.println("-----------");
		FormatDateAndTime.formateShort2();
		System.out.println("-----------");
		FormatDateAndTime.formatStyles();
		System.out.println("-----------");
		FormatDateAndTime.customFormat();
		System.out.println("-----------dateTiemExample");
		FormatDateAndTime.dateTiemExample();
		System.out.println("-----------dateParsing");
		FormatDateAndTime.dateParsing();
	}
	
	public static void formatedDate() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20); 
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(date .format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME)); 
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
	
	public static void formateShort() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 21); 
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime)); // 1/20/20 
		System.out.println(shortDateTime.format(date)); // 1/20/20 
		//System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
	}
	
	public static void formateShort2() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 21); 
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime)); 
		System.out.println(date.format(shortDateTime)); 
		//System.out.println(time.format(shortDateTime)); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException
	}
	
	public static void formatStyles() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20); 
		LocalTime time = LocalTime.of(11, 12, 34); 
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortF = DateTimeFormatter .ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter .ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
	}
	
	public static void customFormat() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 21); 
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
	}
	
	public static void dateTiemExample() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 21); 
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm"); 
		System.out.println(f.format(dateTime));
		//System.out.println(f.format(date)); //java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: ClockHourOfAmPm
		System.out.println(f.format(time));
	}
	
	public static void dateParsing() {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date); // 2015-01-02 
		System.out.println(time); // 11:22
	}

}
