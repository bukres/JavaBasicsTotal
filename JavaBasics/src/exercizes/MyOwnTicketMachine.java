package exercizes;

import java.util.Scanner;

public class MyOwnTicketMachine {

	double priceForAdults;

	double priceForSeniors;

	double priceForWoman;

	double priceForChildren;

	public MyOwnTicketMachine(int maxPrice) {

		priceForAdults = maxPrice;
		priceForSeniors = maxPrice * 0.9;
		priceForWoman = maxPrice * 0.8;
		priceForChildren = maxPrice * 0.7;
	}

	public void PrintTicketForAdults() {

		System.out.println(" Your ticket price is =  " + priceForAdults);
	}

	public void PrintTicketForSeniors() {

		System.out.println(" Your ticket ptice is =  " + priceForSeniors);
	}

	public void PrintTicketForWoman() {

		System.out.println(" Your ticket ptice is =  " + priceForWoman);
	}

	public void PrintTicketForChildren() {

		System.out.println(" Your ticket ptice is =  " + priceForChildren);
	}

	public static void main(String[] args) {

		String category;
		int attempts = 0;

		Scanner SC = new Scanner(System.in);

		MyOwnTicketMachine TM = new MyOwnTicketMachine(20);

		System.out.println("WELCOME TO THE AMUSEMENT PARK");

		System.out.println("please enter the category: Adult/Senior/Women/Child ");

		category = SC.nextLine();

		while (!category.equalsIgnoreCase ("Child") && !category.equalsIgnoreCase ("Women")  && !category.equalsIgnoreCase ("Senior")
				&& !category.equalsIgnoreCase ("Adult") ) {

			System.out.println(" Please enter the valid category");

			category = SC.nextLine();

			

		}

		if (category.equalsIgnoreCase("Child")) {
			//
			TM.PrintTicketForChildren();
		}

		else if ("Women".equalsIgnoreCase(category)) {

			TM.PrintTicketForWoman();
		} else if (category.equalsIgnoreCase("Senior")) {

			TM.PrintTicketForSeniors();
		}

		else if (category.equalsIgnoreCase("Adult")) {

			TM.PrintTicketForAdults();
		}

	}
}
