import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dates {
	public static void main(String[] args) {
		//Create scanner object to collect the first date from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a date here (MM/dd/yyyy): ");
		String value = input.nextLine();
		
		//Collect the second date
		System.out.println("Enter a second date here (MM/dd/yyyy): ");
		String value2 = input.nextLine();
		
		//Use the DateTimeFormatter class to convert the string into LocalDates
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date1 = LocalDate.parse(value, formatter);
		LocalDate date2 = LocalDate.parse(value2, formatter);
		
		//Use the Period statement to calculate the period between the two dates
		Period p = Period.between(date1, date2);
		
		//use the getYears, Months and Days methods to print the period between the dates
		System.out.println(p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days.");
		
	}	
}
