package javaPractice;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of a circle:");
		double radius = scanner.nextDouble();
		scanner.close();
		
		System.out.println("Area of circle is: "+(Math.PI)*radius*radius);
		//area of circle =pi*radius*radius
	}

}
