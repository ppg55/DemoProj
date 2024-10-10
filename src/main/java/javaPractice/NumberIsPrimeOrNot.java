package javaPractice;

import java.util.Scanner;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a prime number");
		int num = scanner.nextInt();
		scanner.close();
		
		boolean isPrime = true;
		
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%2==0) {
					isPrime = false;
					
				}
				
			}
			
		}
		else {
			isPrime = false;
		}
		if(isPrime) {
			System.out.println(num+ " is an prime number");
		}
		else {
			System.out.println(num+ " is not an prime number");
		}
		}
	//primenumber means it should be didisible by either 1 or by same number itself and if divided by any other number the remainder should not equal to 0.	
}


