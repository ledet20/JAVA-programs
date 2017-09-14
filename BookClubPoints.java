/*
Write a program that asks the user to enter the number of books that he or she has purchased
this month and then displays the number of points awarded.
*/


import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numBooks;
		int points;
		
		System.out.print("Enter the number of books you've purchased this month: ");
		numBooks = scan.nextInt();
		
		if(numBooks == 0) {
			points = 0;
			System.out.println("You have earned " + points);
		}
		else if(numBooks == 1) {
			points = 5;
			System.out.println("You have earned " + points);
		}
	
		else if(numBooks == 2) {
			points = 15;
			System.out.println("You have earned " + points);
		}
		else if(numBooks == 3) {
			points = 30;
			System.out.println("You have earned " + points);
		}
		else if(numBooks >=4) {
			points = 60;
			System.out.println("You have earned " + points);
		}
		else {
			System.out.println("Invald point value ");
		}
		
	}

}
