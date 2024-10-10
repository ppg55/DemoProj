package javaPractice;

import java.util.Scanner;

public class InputNumberIsEvenorOd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Input a number");
		int a = scanner.nextInt();
		
		if(a%2==0) {
			
			System.out.println("Given number "+a+ "is an even number");
		}
		else {
			
			System.out.println("Given number "+a+" is an odd number");
		}
		
      scanner.close();
	}

}
