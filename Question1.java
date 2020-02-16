/*
 * This program calculates the cost of a roadtrip. It prompts the user for an amount of distance in kilometers
 * travelled, and the average distance that the vehicle runs with 1 liter of gas. 
 */

import java.util.*;
  
public class Question1 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the distance that will be traveled in kilometers.");
		double distance = input.nextDouble();
		
		System.out.println("Enter the average distance that the vehicle runs with 1 liter of gas.");
		double kmL = input.nextDouble();
		
		double cost = (distance / kmL) * 1.16; //Considering the price of gas as $1.16 CAD per liter
		
		System.out.printf("The estimated cost of this trip is %.2f$.", cost); 
	}

}
