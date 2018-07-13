package Loops;

import java.util.Scanner;

public class NameName {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int correctPIN = 1234;		
		System.out.println("Please enter your pin");
		int enteredPIN = keyboard.nextInt();
		
		int attempts = 3;
		
		while(enteredPIN != correctPIN && attempts < 3) {
		System.out.println("The PIN you entered is incorrect. Please try again");	
		enteredPIN = keyboard.nextInt();
		
		}
				
	System.out.println("Welcome to ABC Bank");
	
	}
	

}
