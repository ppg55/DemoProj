package javaPractice;

import java.util.Scanner;

public class SixNumbersAsInputAndAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnum = scanner.nextInt();
		System.out.println("Enter second number");
		int secondnum = scanner.nextInt();
		System.out.println("Enter third number");
		int thirdnum = scanner.nextInt();
		System.out.println("Enter fourth number");
		int fourthnum = scanner.nextInt();
		System.out.println("Enter fifth number");
		int fifthnum = scanner.nextInt();
		System.out.println("Enter sixth number");
		int sixthnum = scanner.nextInt();
		scanner.close();
		int sum = firstnum+secondnum+thirdnum+fourthnum+fifthnum +sixthnum;
		int average = sum/6;
		System.out.println("average of all 6 above numbers is:" +average);
	}

}
