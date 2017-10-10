//You were driving a little too fast and have been caught speeding by a police officer.
//The officer is a bit of a geek and offers you 3 options to calculate your fine:
    //Option 1: Base fine of $50, +$7 for each mph you were over the limit.
    //Option 2: Base fine of $70, +$3 for each mph you were over the limit.
    //Option 3: Base fine of $100, +$1 for each mph you were over the limit
    
  // create a program that will determine the lowest fine along with the fine amount 
  
  import java.util.Scanner;

public class SpeedTicketCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speedLimit;
		int yourSpeed;
		int amountOver;
		int option1;
		int option2;
		int option3;
		int tempOption; // used to store the lesser of two fines 
		
		System.out.print("The speeding limit was: ");
		speedLimit = scan.nextInt();
    
		while(speedLimit < 0) {
			System.out.print("Please enter a valid speed limit: ");
			speedLimit = scan.nextInt();
		}
		
		
		System.out.print("The speed clocked by the officer: ");
		  yourSpeed = scan.nextInt();
      
		while(yourSpeed < speedLimit) {
			System.out.println("The driver was not speeding ");
			System.exit(0);
		}
		
    
		amountOver = yourSpeed - speedLimit; // value in which you were over the speed limit 
		
		option1 = 50 + (7 * amountOver);
		option2 = 70 + (3 * amountOver);
		option3 = 100 + (1 * amountOver);
		
		System.out.println("Option1 " + option1 + " " + "option2 " + option2 + " " + "option3 " + option3);

    // determine the lowest of the first two options 
		if(option1 < option2) {
			tempOption = option1;
		} else {
			tempOption = option2;
		}
		
    // determine the lowest of the three options 
		if(tempOption <= option3) {
			if(option1 < option2) {
				System.out.println("Your lowest option is option1 " +  tempOption);
			} else {
				System.out.println("Your lowest option is option2 "  + tempOption);
			}
		} else if(tempOption >= option3) {
			System.out.println("Your lowest option is option 3 " + option3 );
		} 
		
	}

}
