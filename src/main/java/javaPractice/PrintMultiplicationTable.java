package javaPractice;

import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(+a+"*"+i+ "="+(a*i));
			scanner.close();
			
			
		}

	}

}
