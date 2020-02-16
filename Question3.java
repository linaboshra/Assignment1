/*
 * This program prompts the user for a whole number (an integer) of 3 digits and outputs the sum
 * of the digits of the input. 
 */

import java.util.*;
  
public class Question3 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a whole 3 digit number");
		int num = input.nextInt();
		
		int add = 0;
		int sum = 0;
		
		while(num > 0) //The following operations will be done as many times as there are digits in the number, in this case three times
		{
		 add = num % 10; //The remainder represents the digit that will be added to the sum
         sum = sum + add; //Add the digit in the previous step to the sum
         num = num / 10; //Move onto the next digit
		}
		
		System.out.println("The sum of the digits in this number equals " + sum); 		
	}

}
