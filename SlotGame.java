import java.util.Random;
import java.util.Scanner;   


/**
  Asks the user to enter the amount of money he or she wants to enter into the slot machine.
  Instead of displaying images, the program will randomly select a word from the
following list:
Cherries, Oranges, Plums, Bells, Melons, Bars

*/
public class SlotGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Random random = new Random();
		 
		 int value;
		 int slot1;
		 int slot2;
		 int slot3;
		 int sumSpent = 0; 
		 int amountWon = 0;
		 int totalWon = 0;
		 int playAgian = 1;
		 
		do {
		 System.out.println("How much would you like to enter into the slot machine? ");
		 value = scan.nextInt();
		 scan.nextLine();
		 
		 sumSpent+= value;
		
		 slot1 = random.nextInt(6);
		 slot2 = random.nextInt(6);
		 slot3 = random.nextInt(6);
		 
		 switch(slot1) {
		 case 0:
			System.out.print("Cherries ");
			break;
		 case 1:
			 System.out.print("Oranges ");
			 break;
		 case 2: 
			 System.out.print("Plums ");
			 break;
		 case 3: 
			 System.out.print("Bells ");
			 break;
		 case 4: 
			 System.out.print("Melons ");
			 break;
		 case 5:
			 System.out.print("Bars ");
			 break;
		 default: 
			 System.out.print("invalid choice ");
		 
		 }
		 
		 switch(slot2) {
		 case 0:
			System.out.print("Cherries ");
			break;
		 case 1:
			 System.out.print("Oranges ");
			 break;
		 case 2: 
			 System.out.print("Plums ");
			 break;
		 case 3: 
			 System.out.print("Bells ");
			 break;
		 case 4: 
			 System.out.print("Melons ");
			 break;
		 case 5:
			 System.out.print("Bars ");
			 break;
		 default: 
			 System.out.print("invalid choice ");
		 }
		 
		 switch(slot3) {
		 case 0:
			System.out.print("Cherries ");
			break;
		 case 1:
			 System.out.print("Oranges ");
			 break;
		 case 2: 
			 System.out.print("Plums ");
			 break;
		 case 3: 
			 System.out.print("Bells ");
			 break;
		 case 4: 
			 System.out.print("Melons ");
			 break;
		 case 5:
			 System.out.print("Bars ");
			 break;
		 default: 
			 System.out.print("invalid choice ");
		 
		 }
		 
		 System.out.println(" ");
		 
		 if(slot1 == slot2 && slot2 == slot3 && slot1 == slot3) {
			 amountWon = value * 3;
			 System.out.println("Congrats you won " + amountWon);
		 } else if((slot1 == slot2 ) || ( slot2 == slot3) || (slot1 == slot3 )) {
			 amountWon = value * 2;
			 System.out.println("Congrats you won " + amountWon);
		 } else {
			 System.out.println("You won $0");
		 }
		 
		 totalWon += amountWon;
		 
		 System.out.println("Would you like to play again? ( press 1 = yes / 0 = no) ");
		 playAgian = scan.nextInt(); 
		 
		 if(playAgian == 0){
			 System.out.println("You spent " +  sumSpent + " dollars at this slot" );
			 System.out.println("Congrats you won $" + totalWon );
			 System.exit(0);
		 }
		 
		 }  while(playAgian == 1);
		 


	}

}
