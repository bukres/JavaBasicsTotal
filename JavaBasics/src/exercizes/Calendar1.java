package exercizes;



import java.util.Scanner;


public class Calendar1 { 

public static void main(String[] args) {
		
		//Please read the instruction above
		
		String monthName;	// name of the month, January, February etc
		int firstDay;	// 0: 1st day is Sunday, 1: 1st day is Monday and so on
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
		days += firstDay; // you can use 'days = days + firstDay;' as well
		for(int i=0; i < days; i++) {
			if(i < firstDay) { System.out.print("\t"); }
			else {
				System.out.print(i - firstDay + 1);
				if(i >= 6 && (i+1)%7 == 0) System.out.println();
				else System.out.print("\t");
			}
		}}}
    