package javaPractice;

import java.util.Scanner;

public class PrintNoOfLettersSpacesdDigitsInSentence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string text");
		String str = scanner.nextLine();
		char[] ch = str.toCharArray();
		
		int digits=0;
		int letters=0;
		int spaces=0;
		int others=0;
		
		for(Character c:ch) {
			if(Character.isDigit(c)) {
			digits++;
		}else if(Character.isLetter(c)) {
			letters++;
		}else if(Character.isSpaceChar(c)) {
			spaces++;
		}else {
			others++;
		}
	}
		System.out.println("Number of digits in given string :" + digits);
		System.out.println("Number of letters in given string :" + letters);
		System.out.println("Number of spaces in given string :" + spaces);
		System.out.println("Number of others in given string :" + others);
	   scanner.close();
	}
}
