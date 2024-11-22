package Java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DateFormatConverter {

	public static void main (String[] args) {

		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter a date in yyyy-MM-dd format: ");
		String inputDate = scanner.nextLine();

		try {

			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

			LocalDate date = LocalDate.parse(inputDate, inputFormatter);
			String formattedDate = date.format(outputFormatter);

			System.out.println("Converted date in dd-MM-yyyy format : " + formattedDate);
		}catch (Exception e) {
			System.out.println ("Invalid date format. Please use yyyy-mm-dd");
		}
		scanner.close();
	}

}


