package exercizes;

import java.util.Scanner;

      public class MultiplicationTable {
	

	  public static void main(String[] args) {
	  // Write your code here
	  
	  int n,i;
	  
	  Scanner SC = new Scanner(System.in);
	  System.out.println("pleae enter a number");
	       n = SC.nextInt();  
	       System.out.println("You entered: " + n );
	       System.out.println( " Here are all " +n+"'s" + "  9"
	       		+ "multyples:");
	       System.out.println();
	       for(i = 1; i <= n; i++) {
	           System.out.println(( i + " x " +n+ " = " + i*n));

	         
	       }
	 }
	}



