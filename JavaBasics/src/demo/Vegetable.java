package demo;

public class Vegetable {
	
	public void fries() 
	 {
		System.out.println(" Fries are tasty but make people fat ");
	}
	public void chips() 
	 {
		System.out.println(" Chips and air together make Lays ");
    }	
    public void couch() 
	 {
		System.out.println(" Couch potato is not a dish ");
				 
	 }
		 
	 public void sideDish() 
		 {
		System.out.println(" Potato can be put in anything to make new side dish ");}
									
		public void pataya() 
		 {
			System.out.println(" Potato is a vegetable and Pataya is a place ");
		
		
	}
	
	


		public static void main(String[] args) {
			
		Vegetable potato = new Vegetable ();
		
		potato.fries();
		//potato.chips();
		//potato.couch();
		//potato.sideDish();
		//potato.pataya();


		
	}
}