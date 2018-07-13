package demo;

public class Calculator {
	
	private Calculator(){
		int a = 15;
		int b = 40;
		
	}


	

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public void multiply(double a, double b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator(); // basicCal is an object of calculator class
		
		Calculator randomCal = new Calculator();
		
		randomCal.multiply(3, 2);
		
		//basicCal.subtract(10, 20);

		//basicCal.multiply(20, 25);

		//basicCal.divide(28, 7);

		//basicCal.multiply(3.4, 4.5);

	}

}
