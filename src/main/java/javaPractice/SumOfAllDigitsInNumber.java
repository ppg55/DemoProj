package javaPractice;

import java.util.Scanner;

public class SumOfAllDigitsInNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();
		int sum=0;
		while(num>0) {
			int reminder=num%10;
			sum=sum+reminder;
			num=num/10;
	}
       System.out.println("Sum of all digits in a number:" +sum);
  } 
}
