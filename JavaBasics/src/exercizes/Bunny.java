package exercizes;

public class Bunny {

		private String color;
		private int height;
		private int length;

		public Bunny(int length, int theHeight) {
			length = this.length; // backwards – no good!
			height = theHeight; // fine because a different name
			this.color = "white"; // fine, but redundant
		}

		public static void main(String[] args) {
			Bunny b = new Bunny(1, 2);
			System.out.println(b.length + " " + b.height + " " + b.color);

			/*
			 * Line 6 is incorrect and you should watch for it on the exam. The instance
			 * variable length starts out with a 0 value. That 0 is assigned to the method
			 * parameter length. The instance variable stays at 0. Line 7 is more
			 * straightforward. The parameter theHeight and instance variable height have
			 * different names. Since there is no naming collision, this is not required.
			 * Finally, line 8 shows that it is allowed to use this even when there is no
			 * duplication of variable names.
			 */
		}
	}


