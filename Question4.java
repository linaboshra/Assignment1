/*
 * This program prompts the user for an URL, it removes any leading or trailing whitespace
 * from the string, outputs "Verifying an URL with X characters...", replacing X by the size 
 * of the URL, and the string "Is this a valid and secure URL? true." if the URL starts with 
 * "https://" or "Is this a valid and secure URL? false." otherwise.
 */
 
import java.util.*;
 
public class Question4 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter an URL");
		String inURL= input.nextLine();
		String url = inURL.trim();
		
		int length = url.length();
		
		System.out.println("Verifying an URL with " + length + " characters...");
		
		if (url.startsWith("https://")){
			System.out.println("Is this a valid and secure URL? true.");
		} else {
			System.out.println("Is this a valid and secure URL? false.");
		}
		
	}

}