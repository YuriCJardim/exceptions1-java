package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.enteties.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Romm number: ");
		int number = sc.nextInt();

		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());

		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date ");
		} else {
			Reservation res = new Reservation(number, checkIn, checkOut);
			System.out.println( res);
			
			  System.out.println();
				System.out.println("Enter data to update the reservation: ");
				
				System.out.print("Check-in date (dd/MM/yyyy): ");
				checkIn = sdf.parse(sc.next());
				System.out.print("Check-out date (dd/MM/yyyy): ");
				checkOut = sdf.parse(sc.next());
								
				String error = res.updateDates(checkIn, checkOut);
				if(error !=null) {
					System.out.println("Reservation error: " + error);
				}else {	
				System.out.println( "Reservation" + res)  ;
				
		}
     
		
		
		
	}

}
}