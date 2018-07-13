package exercizes;

import java.util.Scanner;

public class Quberator {
	
	   public static void main(String[] args)

	   {
	       int i,n;
	       	       Scanner in = new Scanner(System.in);
	       	       
	       	    System.out.print("Input number of terms : ");
	       	    
	   		    n = in.nextInt();

	        for(i=1;i<=n; i++)
	        {
	        System.out.println(i+ " qube is equal to "+(i*i*i));     
	       }
	    }
	   }