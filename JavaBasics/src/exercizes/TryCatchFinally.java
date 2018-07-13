package exercizes;

public class TryCatchFinally {
	
	public static int retInt() {
		int a = 100;
		try {  
			return a;
		} catch (ArithmeticException e) {
			
			System.out.println("Catch called");
			System.out.println(e);
			return a;
		}finally {
			a = 5000;
			System.out.println("Finally caled");
			return a;
		}
	}
	public static void main(String[] args) {
		System.out.println(retInt());
		
	}

}
