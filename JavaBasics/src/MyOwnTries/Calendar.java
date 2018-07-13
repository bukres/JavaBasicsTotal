package MyOwnTries;


	
	

	import java.util.Scanner;

	public class Calendar {

		public static void main(String[] args) {
			
			//Please read the instruction above
			
			String monthName = "";	// name of the month, January, Februdary etc
			int firstDay = 0;	// 0: 1st day is Sunday, 1: 1st day is Monday and so on
			int days = 31; 		// number of days in a given month
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the name of month:");
			monthName =  scan.nextLine();
			System.out.print("Enter the number of days:");
			days =  scan.nextInt();
			System.out.print("First day of the month:");
			firstDay =  scan.nextInt();
			
			System.out.println("Month Calendar");
			System.out.println("Month:" + monthName);
			System.out.println("S\tM\tT\tW\tT\tF\tS");
			
			//TO DO
			//Your code hoes here
			int i = 0;
			//while (days>=31) {
				//System.out.println(days);
				//days++;
			
			
			for(i =0; i<= firstDay; i++ ) {
				
				System.out.println("\t");
				
			}
		}

	}



