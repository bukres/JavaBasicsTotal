package exercizes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		 
		; 
		Scanner k = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number");
		
		
		int num1 = k.nextInt();
		
		System.out.println("Please enter another number");
		
		int num2 = k.nextInt();
		
		System.out.println("The result of division of " + num1 + " by " + num2 + " is " + (num1/num2));
		}
		
		catch(Exception e) {
			
			System.out.println(" Please enter a valid number");
		}
		
		
		
	}

}
