package exceptionsPackage;

public class DoSomething {
	
	public void go() {
		 System.out.print("A");
		 try {
		 stop();
		 } catch (ArithmeticException e) {
		 System.out.print("B");
		 } finally {
		 System.out.print("C");
		 }
		 System.out.print("D");
		 }
		 public void stop() {
		 System.out.print("E");
		 Object x = null;
		 try {
		 x.toString();}
		 catch (NullPointerException e) {}
		 System.out.print("F");
		 }
		 public static void main(String[] args) {
		 new DoSomething().go();
		 }
		 }


