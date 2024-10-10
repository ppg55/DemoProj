package javaPractice;

import java.util.Scanner;

public class FindQuotientAndReminder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		System.out.println("Enter divisor");
		int divisor = scanner.nextInt();
		scanner.close();
		
		System.out.println("Quotient is :" +num/divisor);
		System.out.println("Remainder is :" +num%divisor);
		
		
	}

}
