package javaPractice;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter radius of a circle");
		byte num = scanner.nextByte();
		scanner.close();
		
		System.out.println("Perimeter of a circle is :" +(2*num*Math.PI));

	}

}
