package com.smoothstack.jb.day5;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.Month;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.time.Instant;

public class DateTime {

	Instant birthday;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateTime m1 = new DateTime();
		Scanner scanner = new Scanner(System.in);
		
		m1.printMenu();
		try {
			m1.menu(scanner);
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
		}
		
	}
	
	public LocalDate createSimpleDate(Scanner scanner) throws InputMismatchException {
		System.out.print("Enter year: ");
		int year=scanner.nextInt();
		System.out.print("Enter month: ");
		int month=scanner.nextInt();
		System.out.print("Enter day: ");
		int day=scanner.nextInt();
		return LocalDate.of(year, month, day);
	}
	
	public void printMenu() {
		System.out.println("1. Store birthday");
		System.out.println("2. Find Previous Thursday");
		System.out.println("3. Convert Instant to ZonedDateTime");
		System.out.println("4. Convert ZonedDateTime to Instant");
		System.out.println("5. Print Month Lengths for a year");
		System.out.println("6. List Mondays of this month");
		System.out.println("7. Friday the 13th?");
		System.out.println("0. Exit");
	}
	
	public boolean menu(Scanner scanner) throws InputMismatchException{
		int choice;
		LocalDate date;
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:
			//store birthday
			System.out.println("Enter time in this format: 007-12-03T10:15:30.00Z");
			try {
				storeBirthday(Instant.parse(scanner.nextLine()));
				System.out.println("Successfully stored");
			}
			catch(DateTimeParseException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			//Find previous Thursday
			date = createSimpleDate(scanner);
			previousThursday(date);
			break;
		case 3:
			//Instant to ZonedDateTime
			
			break;
		case 4:
			//ZonedDateTime to Instant
			
			break;
		case 5:
			//find length of each month
			System.out.print("Enter a year to check: ");
			choice = scanner.nextInt();
			printMonthLengths(choice);
			break;
		case 6:
			//list mondays
			date = createSimpleDate(scanner);
			for (LocalDate i : iHateMondays(date)) {
				System.out.println(i.toString());
			}
			break;
		case 7:
			//Friday 13
			date = createSimpleDate(scanner);
			System.out.println(isThirteenth(date));
			break;
		case 8:
			return false;
		}
		return true;
	}
	
	public boolean storeBirthday(Instant date) {
		birthday = date;
		return true;
	}
	
	public LocalDate previousThursday(LocalDate date) {
		DayOfWeek weekDay = date.getDayOfWeek();
		//each day has a value with monday starting at 1
		//compare takes the first day number and subtracts the second from it
		int offset = DayOfWeek.THURSDAY.compareTo(weekDay);
		// if the Thursday is in a feature date or if the day is Thursday
		if (offset >= 0) {
			offset -= 7;
		}
		int day = date.getDayOfMonth() + offset;
		int month = date.getMonthValue();
		int year = date.getYear();
		// if the day is on the previous month
		if (day <= 0) {
			//change to previous month
			month--;
			if (month==0) {
				month=12;
			}
			day = Month.of(month).length(isLeap(year)) + offset;
		}
		//time doesn't matter in this case
		LocalDate prevThur = LocalDate.of(year, month, day);
		return prevThur;
	}
	
	/*
	 * Question: The difference between a ZoneID and a ZoneOffset
	 * The
	 */
	public ZonedDateTime findZonedTime(Instant date, int offset) {
		return null;
	}
	
	public Instant findInstantTime(ZonedDateTime date, int offset) {
		return null;
	}
	
	public boolean printMonthLengths(int choice) {
		boolean leap = Year.isLeap(choice);
		try {
			for (Month month:Month.values()) {
				System.out.println("The length of " + month.name() + " is " + month.length(leap));
			}
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public List<LocalDate> iHateMondays(LocalDate date) {
		// find every Monday date
		List<LocalDate> mondayMadness = new ArrayList<LocalDate>();
		int i = date.getDayOfMonth();
		DayOfWeek day = date.getDayOfWeek();
		i += day.compareTo(DayOfWeek.MONDAY);
		//Goes to the first monday
		while (i>0) {
			i-=7;
			date.minusDays(7);
		}
		i+=7;
		date.plusDays(7);
		int length = Month.of(date.getMonthValue()).length(isLeap(date.getYear()));
		for (;i<=length;i+=7) {
			mondayMadness.add(date);
			date=date.plusDays(7);
		}
		return mondayMadness;
	}
	
	public boolean isThirteenth(LocalDate date) {
		if (date.getDayOfWeek()==DayOfWeek.FRIDAY&&date.getDayOfMonth()==13){
			return true;
		}
		return false;
	}
	
	/**
	 * Takes too long to get the year singleton just to find a boolean value
	 * for a month. Copied directly from Year class of Date Time api.
	 * @param year
	 * @return
	 */
	private boolean isLeap(int year) {
		return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
	}
	
}
