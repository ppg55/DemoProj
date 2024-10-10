package javaPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
						
		}
		System.out.println("fact :" +fact);

	}

}
