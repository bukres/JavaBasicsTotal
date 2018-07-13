package demo;

public class Calculator2 {
	
	public int add(int a, int b) {
		return(a+b);
	}
			
	public void subtract(int a, int b) {
		System.out.println(a-b);
			}
	public void multiply(int a, int b) {
		System.out.println(a*b);
			}
	public void divide(int a, int b) {
		System.out.println(a/b);
			}
	
	
	public static void main(String[] args) {
		
		Calculator2 basicCal = new Calculator2();
		//System.out.println(basicCal.add(87,33));
		
		basicCal.divide(128,8);
		basicCal.multiply(5,48);
		basicCal.subtract(5,48);
		basicCal.add(5,95);
		

		
	}
	

}
