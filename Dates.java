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
		
		System.out.println("Enter a second date here (MM/dd/yyyy): ");
		String value2 = input.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date1 = LocalDate.parse(value, formatter);
		LocalDate date2 = LocalDate.parse(value2, formatter);
		
		Period p = Period.between(date1, date2);
		
		System.out.println(p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days.");
		
	}	
}
