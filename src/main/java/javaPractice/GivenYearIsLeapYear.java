package javaPractice;

import java.util.Scanner;

public class GivenYearIsLeapYear {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter any year:");
		 int year = scanner.nextInt();
		 scanner.close();
		 if(year%4==0) {
			 
			 if(year%100==0) {  
				 
				 if(year%400==0) {
					 
					 System.out.println(+year+ " is  a leap year");
				 }
				 else {
					 System.out.println(+year+ " is not a leap year");
				 }
				 
			 }
			 else {
				 System.out.println(+year+ " is  a leap year");
			 }
			 
		 }
		 else {
			 System.out.println(+year+ " is not a leap year");
		 }

	}
//if the year is evenly divisible by 4 and not divisible by 100,then it is a leap year
//if the year is evenly divisible by both 4 and 100,then we need to check if it is evenly divisible by 400,to confirm it as leap year.
}
