package javaPractice;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter width of Rectangle");
		double Widnum = scanner.nextDouble();
		System.out.println("Enter length of Rectangle");
		double lennum = scanner.nextDouble();
		double area = lennum*Widnum;
		System.out.println("Area of rectangle :" +area);
		scanner.close();

	}

}
