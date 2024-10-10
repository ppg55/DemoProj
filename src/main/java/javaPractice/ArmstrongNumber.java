package javaPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();
		int originalNum =num;
		int cubedNum=0;
		
		while(num>0) {
			int reminder=num%10;
			cubedNum=cubedNum+(reminder*reminder*reminder);
			num=num/10;
		}
		if(originalNum==cubedNum) {
			
			System.out.println(originalNum+ " is an Armstrong Number");
			
		}
		else {
			System.out.println(originalNum+ " is not an Armstrong Number");
		}

	}

}
