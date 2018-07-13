package Inheritance;

public class Security extends Accounts{
	
	int bonus = 9000;	
	
	public static void main(String[] args) {		
		
		Security David = new Security();	
		 
		 System.out.println("Salary of David is = $" + David.salary);
		 System.out.println( "Bonus of David = $ " + David.bonus);
		 System.out.println("Extra 150 hours = $" + David.extraHours);
		 System.out.println("David's total anualy earnings is = $" + (David.salary + David.bonus + David.extraHours));
		 David.day();
}
}
