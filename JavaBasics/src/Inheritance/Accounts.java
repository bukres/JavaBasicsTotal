package Inheritance;

public class Accounts extends Management {
	
	int bonus = 7000;
    int extraHours = 5000;

	
	
	public static void main(String[] args) {
		 Accounts Marc = new Accounts();
		 
		 System.out.println( "Bonus of Marc = $ " + Marc.bonus);
		 System.out.println("Salary of Marc is = $" + Marc.salary);
		 System.out.println("Salary of Marc is = $" + Marc.salary);

		 
	}

}
