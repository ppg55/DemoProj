package javaPractice;

import java.util.Scanner;

public class GivenCharacterIsVowel {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter any character:");
		char c=scanner.next().charAt(0);
		scanner.close();
		
		switch(c) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c+ " is an vowel");
			break;
		default:
			System.out.println(c+ " is an consonant");
		}
		
		
		

	}

}
