package Loops;

import java.util.Scanner;

public class AccountBlocked {
	
	public static void main(String[] args) {
		
		int correctPIN = 1234;
		int attempts = 1;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println(" Enter your PIN number please ");
		
		int enteredNumber = key.nextInt();
		
		while((enteredNumber != correctPIN) && attempts<3) {
			
			System.out.println(" Your PIN is incorrect, try again please ");
			enteredNumber = key.nextInt();
			attempts++;
			
		}
		
		if((enteredNumber == correctPIN) && attempts <=3)
		System.out.println(" Welcome to your Best Bank ");
		
	
		
		else {
			
			System.out.println(" because of three unsuccessful attempts, your card has been blocked ");
		}
	}}

