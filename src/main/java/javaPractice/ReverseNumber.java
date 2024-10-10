package javaPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
	    scanner.close();
		int reversednum =0;
		while(num>0) {
			int reminder = num%10;//1/10=1
			reversednum=(reversednum*10)+reminder;//54321
			num=num/10;
			
		}
   System.out.println("The reverse number is " +reversednum);
	}

}
