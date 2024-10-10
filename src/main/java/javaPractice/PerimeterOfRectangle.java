package javaPractice;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		double leng = scanner.nextDouble();
		System.out.println("Enter width of rectangle");
		double wid = scanner.nextDouble();
		double sum=(leng+wid);
		scanner.close();
		System.out.println("Perimeter of Rectangle is :" +2*sum);
	}

}
