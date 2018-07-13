package exercizes;


	
	/**
	 * 
	 * 


		
		
		
		Write a program which reads a sequence of positive integers and prints the cumulative totals.
		
		Cumulative total is sum of integers you have seen so far. 
		
		Your program should stop reading inputs when the input is -1

	Example:

	----------------------------
	Enter numbers: 1 7 2  9 -1 
	Cumulative total:1 8 10 19 
	---------------------------


	Hint:
	1: sum of first number
	8= 1 + 7
	10= 1 + 7 + 2
	19 = 1 + 7 + 2 + 9

	You stop when you see -1.

	@author anwar mamat
	 */

	

	import java.util.Scanner;

	public class Cumulatives {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int sum = 0;                     //summa
			System.out.print("Enter Numbers:");
			int n = 0;                       //user number
			String result = "Cumulative total:";
			
			while (n != -1)  {              //usernumber -1 ga teng bolmasa
			sum += n;                      // shu yerda sum =0 ga usernumber qoshilyapti
			
			
			//  i am trying to add integer to string. before adding integer to string 
	     	//	i need to convert integer to string and then add
			
			if (sum != 0) result += " " + Integer.toString(sum);
			n=sc.nextInt();                // nomer o'qiladi
					
			}
			System.out.println(result);	
		}
			
			
		}
			






