package exercizes;

public class Nilufer {	
		
	int variable = 5;
	int promjenjljiva = 12;
	
	Nilufer() {
		this.variable = promjenjljiva;			
	  }	
	
	  public static void main(String args[]) {		  
		  
		  Nilufer obj = new Nilufer();
	    obj.method(20);
	    obj.method();	    
	  } 

	  void method(int variable) {
	    variable = 10;
	    System.out.println("Value of variable :" + this.promjenjljiva);
	  }
	  void method() {
	    int variable = promjenjljiva;
	    System.out.println("Value of variable :" + variable);
	  }	  
	}


