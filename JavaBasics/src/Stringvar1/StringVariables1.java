package Stringvar1;

import java.util.Scanner;

public class StringVariables1 {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		String first_name;
		System.out.print("Enter your first name: "); 
		first_name = userInput.next();
		
		String family_name;
		System.out.print("Enter your family name: ");
		family_name = userInput.next();
		
		String full_name;
		full_name = first_name + " " + family_name;
		
		
		System.out.println("You are " + full_name);

	}
	

}
