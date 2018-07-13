package exercizes;

public class Factorial {

	void fact(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		System.out.println(n + "!  is " + fact);

	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.fact(5);

	}

}
