package demo;

public class Humana {
	
	String color;
	int age;
	String gender; 
	double height;
	
	public Humana(int starost ) { 
		
		color = "bronze";
		age = starost;
		starost = 12;
		gender = "male";
		height = 6.3;
	}
	
	public Humana(String humanColor, int humanAge, String humanGender, double humanHeight) {
	      
		color = humanColor;
	    age = humanAge;
	    humanAge = 77;
	    gender = humanGender;
	    height = humanHeight;
	    humanHeight = 6.3;
	}
	
	public void features() {
		System.out.println("color = " + color + ", age = " + age + ", gender = " + gender + ", height = " + height);
	}
			public static void main(String[] args){

	       	Humana John = new Humana(13);
	       	Humana Adnan = new Humana("bijelac", 524, "muski", 5.2);
	       	//John.features();
	       	Adnan.features();
	       	
	       	
	       	
	     

}
}