/*
Write a program to help the user determine if it is worth buying a stock. Ask the user for
the number of shares they will purchase, the price they will purchase them at, the price they plan to sell
them at, and the percentage of broker commission for EACH transaction. Then output the amount of
money they will gain or lose.
*/

import java.util.Scanner;

public class Stocks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int shares;
		double priceOfStock;
		double sellPriceOfStock;
		int commisionForPurchase;
		int commisionForSell;
		double totalPurchasePrice;
		double buyCommission;
		double sellCommission;
		double totalSellPrice;
		double stockDifference;
		double netValue;
		
		System.out.print("The number of share\'s you bought: ");
		shares = scan.nextInt();
		
		System.out.print("The purchase price of the stock: ");
		priceOfStock = scan.nextDouble();
		
		System.out.print("The sell price of the stock: ");
		sellPriceOfStock = scan.nextDouble();
		
		System.out.print("The percenteage commision charged by the broker for the purchase: ");
		commisionForPurchase = scan.nextInt();
		
		System.out.print("The percetnage commision charged by the borker for the sell: ");
		commisionForSell = scan.nextInt();
		
		totalPurchasePrice = shares * priceOfStock;
		buyCommission = totalPurchasePrice * .07;
		totalSellPrice = shares * sellPriceOfStock;
		sellCommission = totalSellPrice * .05;
		stockDifference = sellPriceOfStock - priceOfStock;
		netValue = (stockDifference * shares) - buyCommission - sellCommission;
		
		
		System.out.print("You will net a value of: " + netValue);
		

	}

}
