/*
 * This program generates a random number between 0 and 100, and performs mathematical 
 * operations with it. The output prints the random number and the result of 5 operations 
 * with it: powers of 2 and 3, square root, natural logarithm and base 10 logarithm.
 */
 
import java.util.*;
 
public class Question5 {

    public static void main(String[] args) {
		
		Random randomNum = new Random();
		int num = randomNum.nextInt(101);
		
		System.out.println("The randomly generated number is " + num);
		/* All 5 operations are computed within the print statement */
		System.out.printf("The square of " + num + " is %.0f\n", (Math.pow(num, 2))); 		
		System.out.printf("The cube of " + num + " is %.0f\n", (Math.pow(num, 3)));
		System.out.printf("The square root of " + num + " is %.2f\n", (Math.sqrt(num)));
		System.out.printf("The natural logarithm of " + num + " is %.2f\n", (Math.log(num))); 
		System.out.printf("The base 10 logarithm of " + num + " is %.2f\n", (Math.log10(num))); 
		
	}

}