/*
Write a program that asks the user to enter their name (using Scanner). Store this value
in a String variable. Then output the middle character of the string. If the string has an even number of
letters, it has 2 middle characters. In this case, you can output the right-middle character.
*/

import java.util.Scanner;

public class StoreName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.print("Please enter your name: ");
		name = scan.nextLine();
		
		
		int letter = name.length() / 2;
		char theLetter = name.charAt(letter);
			
			System.out.print("The middle character is: " + theLetter);
		}
		
	}
