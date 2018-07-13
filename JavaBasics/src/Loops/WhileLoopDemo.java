package Loops;

import java.util.Scanner;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		 int correctPIN = 1234;
		 int tries = 1;
		 
		 Scanner kb = new Scanner(System.in);
		 
		 System.out.println(" Enter your PIN number please");
		 
		int enteredPIN = kb.nextInt();
		
		while((enteredPIN != correctPIN) && tries < 3) {
			System.out.println(" Your PIN is incorrect, please try again ");
		enteredPIN = kb.nextInt();
		tries++; 
			
			
		}
		
		if((enteredPIN == correctPIN) && tries <=3){
			
			System.out.println(" Welcome to the Best Bank ");
		}
		
		else {
			System.out.println(" Due to an exceeded number of attempts, your card is blocked ");
		}}}
		
	
	

	
	

	
	
	



	

	
