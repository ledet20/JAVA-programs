/*
Write a program that asks for the number of checks written for the month. The program
should then calculate and display the bank’s service fees for the month.
*/


import java.util.Scanner;

public class BankCharge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int BASE_FEE = 10;
		double checkFee;
		int check;
		
		System.out.print("Enter the number of checks written this month: ");
		check = scan.nextInt();
		
		if(check < 20) {
			checkFee = check * BASE_FEE * .10;
			System.out.println("the bank service fee for this month is " + checkFee);
		}
		else if(check >= 20 && check < 40) {
			checkFee = check * BASE_FEE * .08;
			System.out.println("the bank service fee for this month is " + checkFee);
		}
		else if(check >= 40 && check < 60 ) {
			checkFee = check * BASE_FEE * .06;
			System.out.println("the bank service fee for this month is " + checkFee);
		}
		else if(check >= 60) {
			checkFee = check * BASE_FEE * .04;
			System.out.println("the bank service fee for this month is " + checkFee);
		}
		else {
			System.out.println("Invalid number of checks ");
		}
    
	}
  
}
