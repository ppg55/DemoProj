package javaPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scanner.nextInt();
		scanner.close();
		
		int a=1, b=1;
		System.out.println(a+ " ");
		System.out.println(b+ " ");
		int f=0;
		while(f<=num) {
			f=a+b;
			if(f>num) 
				break;
			System.out.println(f+ " ");
			a=b;
			b=f;
			
			
		}
		
		

	}

}
