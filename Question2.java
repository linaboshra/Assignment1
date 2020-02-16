/*
 * This program prompts the user for the price of a product in CAD, and outputs the values of sales
 * tax in Quebec (TPS + TVQ), tips of 15%, and the total amount that should be paid. 
 */

import java.util.*;
  
public class Question2 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the price of the product in CAD");
		double price = input.nextDouble();
		
		double taxTPS = price * 0.05; //TPS is 5% of the price
		double taxTVQ = price * 0.09975; //TVQ is 9.975% of the price
		double tip = price * 0.15;
		
		double cost = price + taxTPS + taxTVQ + tip;
		
		System.out.printf("TPS value: %.2f$\n", taxTPS); 
		System.out.printf("TVQ value: %.2f$\n", taxTVQ); 
		System.out.printf("Tips value: %.2f$\n", tip); 
		System.out.printf("Total amount to be paid: %.2f$\n", cost); 
	}

}
