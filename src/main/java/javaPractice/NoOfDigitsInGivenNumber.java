package javaPractice;

import java.util.Scanner;

public class NoOfDigitsInGivenNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();
		
		int digitCount =0;
		while(num>0) {
			digitCount++;
			num=num/10;
			
		}
		System.out.println("No of digits in given number is :" +digitCount);

	}

}

