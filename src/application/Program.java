package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.USInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService service = new USInterestService(1.0);
		double payment = service.payment(amount, months);
		
		
		System.out.println("Payment after " + months + " months");
		System.out.println(String.format("%.2f", payment));
		
		
		sc.close();
		
	}

}
