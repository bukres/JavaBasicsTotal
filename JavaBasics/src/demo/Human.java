package demo;

public class Human {
	String color;
	int age;
	String gender;
	String le;
	String insan;

	public Human() {// This is a default constructor with 3 default values
		color = "Brown";
		age = 25;
		gender = "Male";
	}

	public Human(String female) {
		color = "white";
		age = 30;
		gender = female;
	}

	public Human(int yas) {
		color = "beyaz,";
		age = yas;
		gender = "hanim";

	}

	public Human(String humanColor, int humanAge) {

		color = humanColor;
		age = humanAge;
		gender = "erkek";

	}

	public Human(String humanColor, int humanAge, String humanGender) {
		color = humanColor;
		age = humanAge;
		gender = humanGender;
		le = " Zenstvena ";

	}

	public void details(String insan) {
		System.out.println("Color = " + color + " Age = " + age + ", Gender = " + gender);

	}

	public void missingDetails() {
		System.out.println("color = " + color + " gender = " + gender);
	}

	public static void satisfyHunger() {
		System.out.println("Hunger can be satisfied by having food");
	}

	public static void humanConversation() {
		System.out.println(" Every human uses language for conversation ");
	}

	public static void main(String[] args) {

		Human John = new Human("Bijelac", 25, "Male");
		Human Ram = new Human("Brown", 27, "Male");
		Human Rose = new Human("White", 29, "Female");
		Human Tim = new Human("deli");
		Human Paul = new Human();
	     Human Jack = new Human("pat", 5);
		       Jack = new Human("pat");
		       //Jack = new Human();

		Human Fatih = new Human("Bijelac", 7);
		Human Mina = new Human(11);

		// System.out.println(Rose.age + " " + Fatih.color);
		// System.out.println(Rose.le);
		Fatih.missingDetails();
		//Fatih.details("Ahmet");
		// Rose.missingDetails();
		//Rose.details();
		// John.details();
		// Mina.details();
		// Tim.details();
		  // Paul.details("");
		// Jack.details("");
		//satisfyHunger();

		//Rose.satisfyHunger();

		// humanConversation();
	}

}
