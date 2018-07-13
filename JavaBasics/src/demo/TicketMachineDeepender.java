package demo;

import java.util.Scanner;

/*
 * This program asks a user to enter his category and prints the ticket accordingly.
 * If he is a Child, he will be given a 10% discount.
 * If she is a Woman, she will be given a 15% discount.
 * If he is a Senior Citizen, he will be given a 20% discount.
 * If he is an Adult, he will be given no discount.
 */

public class TicketMachineDeepender {

	
	double priceForChildren;
	double priceForWomen;
	double priceForSeniorCitizens;
	double priceForAdult;
	
	public TicketMachineDeepender(int maxPrice){
		priceForAdult = maxPrice;
		priceForChildren = maxPrice * 0.9;
		priceForWomen = maxPrice *0.85 ;
		priceForSeniorCitizens = maxPrice * 0.8;
	}
	
	public void printTicketForChildren(){
		System.out.println("Your ticket price = $ " + priceForChildren);
	}
	
	public void printTicketForWomen(){
		System.out.println("Your ticket price = $" + priceForWomen);
	}
	
	public void printTicketForSeniorCitizens(){
		System.out.println("Your ticket price = $" + priceForSeniorCitizens );
	}
	
	public void printTicketForAdults(){
		System.out.println("Your ticket price = $" + priceForAdult );
	}
	
	public static void main(String[] args) {
		String category;
		Scanner Sc = new Scanner(System.in);		
		
		TicketMachineDeepender TM = new TicketMachineDeepender(20);
		
		System.out.println("Hello! ");
		System.out.println("Welcome to Ticket Booking Hub");
		
		System.out.println("Please choose your category - Child/Women/Senior Citizen/Adult");
		category = Sc.nextLine();
		
		if(category.equals("Child")){
			TM.printTicketForChildren();
		}
		
		else if(category.equals("Women")){
			TM.printTicketForWomen();
		}
		
		else if(category.equals("Senior Citizen")){
			TM.printTicketForSeniorCitizens();
		}
		
		else if (category.equals("Adult")){
			TM.printTicketForAdults();
		}
		
		else {
			System.out.println("Please enter a valid input");
		}
	}

}



