/**
   Write a program that asks the user for a positive nonzero integer value. The program should
use a loop to get the sum of all the integers from 1 up to the number entered. For example,
if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50
*/

import java.util.Scanner;   

public class SumIteration {
   public static void main(String[] args)  {
	 Scanner scan = new Scanner(System.in);
   
	 int integer;
	 int sum = 0;
	 
	 System.out.println("Enter a posivie nonzero integer: ");
	 integer = scan.nextInt();
	 scan.nextLine();
	 for(int i = 1; i <= integer; ++i) {
		 sum+=i;
	 }
	 
	 System.out.println("The sum is " + sum);
	 
   }
     
}
