package exercizes;

//import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Arrays;

//import funnSelenium.ChromeDriver;
//import funnSelenium.WebDriver;

import static java.lang.Math.*;

//public class Boyarsky {

	// static {
	// int[] countsOfMoose = new int[3];
	// int num = countsOfMoose[-1];
	// }

	// public static void main(String[] args) {

	/*************************************************
	 * //Page:157
	 * 
	 * String a = "abc"; String b = a.toUpperCase(); b = b.replace("B",
	 * "2").replace('C', '3'); System.out.println("a=" + a); System.out.println("b="
	 * + b);
	 * 
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:157
	 * 
	 * String alpha = ""; for(char current = 'a'; current <= 'z'; current++) alpha
	 * += current; System.out.println(alpha);
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:163
	 * 
	 * StringBuilder one = new StringBuilder(); StringBuilder two = new
	 * StringBuilder(); StringBuilder three = one.append("a");
	 * System.out.println(one == two); // false System.out.println(one == three); //
	 * true } }
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:164
	 * 
	 * String x = "Hello World"; String z = " Hello World".trim();
	 * System.out.println(x.equals(z)); // true } }
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:169
	 * 
	 * int[] numbers = new int[10]; for (int i = 0; i < numbers.length; i++)
	 * numbers[i] = i + 5; } }
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:171
	 * 
	 * int[] numbers = {2,4,6,8};
	 * 
	 * System.out.println(Arrays.binarySearch(numbers, 7));//-4
	 * System.out.println(Arrays.binarySearch(numbers, 2)); // 0
	 * System.out.println(Arrays.binarySearch(numbers, 4)); // 1
	 * System.out.println(Arrays.binarySearch(numbers, 1)); // -1
	 * System.out.println(Arrays.binarySearch(numbers, 3)); // -2
	 * System.out.println(Arrays.binarySearch(numbers, 9)); // -5
	 * 
	 * 
	 * } }
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:172
	 * 
	 * int numbers = new int[] {3,2,1};
	 * System.out.println(Arrays.binarySearch(numbers, 2));
	 * System.out.println(Arrays.binarySearch(numbers, 3)); } }
	 * 
	 *************************************************/

	/*************************************************
	 * // Page: 174
	 * 
	 * int[][] twoD = new int[3][2]; for (int i = 0; i < twoD.length; i++) { for
	 * (int j = 0; j < twoD[i].length; j++) System.out.print(twoD[i][j] + " "); //
	 * print element System.out.println(); // time for a new row } } }
	 * 
	 * 
	 *************************************************/

	/*************************************************
	 * // Page: int[][] twoD = new int[3][2];
	 * 
	 * for (int[] inner : twoD) { for (int num : inner) System.out.print(num + " ");
	 * System.out.println(); } } }
	 * 
	 *************************************************/

	/*************************************************
	 * // Page:191
	 * 
	 * LocalDate start = LocalDate.of(2015, Month.JANUARY, 1); LocalDate end =
	 * LocalDate.of(2015, Month.MARCH, 30); performAnimalEnrichment(start, end); }
	 * private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
	 * LocalDate upTo = start; while (upTo.isBefore(end)) { // check if still before
	 * end System.out.println("give new toy: " + upTo); upTo = upTo.plusMonths(1);
	 * // add a month } }}
	 * 
	 *************************************************/

	/*************************************************
	 * //Page:234 int num = 4; newNumber(5); System.out.println(num); // 4 } public
	 * static void newNumber(int num) { num = 8; } }
	 * 
	 *************************************************/

	/*************************************************
	 * // Page: System.out.println(Math.sqrt(4)); System.out.println(Math.pow(2,
	 * 2)); System.out.println(Math.abs(6.3));
	 * 
	 * System.out.println(sqrt(4)); System.out.println(pow(2, 2));
	 * System.out.println(abs(6.3));
	 * 
	 * } }
	 *************************************************/

	/*************************************************
	 * //Page: //String name = "Webby"; //speak(name); //System.out.println(name);
	 * //} //public static void speak(String name) { //name = "Sparky"; //}
	 * 
	 * StringBuilder name = new StringBuilder(); speak(name);
	 * System.out.println(name); // Webby } public static void speak(StringBuilder
	 * s) { s.append("Webby"); } }
	 *************************************************/

	/*************************************************
	 * // Page: 237 int number = 1; // 1 String letters = "abc"; // abc
	 * number(number); // 1 letters = letters(letters); // abcd
	 * System.out.println(number + letters); // 1abcd }
	 * 
	 * public static int number(int number) { number++; return number; }
	 * 
	 * public static String letters(String letters) { letters += "d"; return
	 * letters; } }
	 *************************************************/

	/*************************************************
	 * //Page: 239
	 * 
	 * public void fly(int numMiles) { } public void fly(Integer numMiles) { } } }
	 *************************************************/

	/*************************************************
	 * // Page: 249 private String name = "Torchie"; { System.out.println(name); }
	 * private static int COUNT = 0; static { System.out.println(COUNT); } {
	 * COUNT++; System.out.println(COUNT); }
	 * 
	 * public Boyarsky() { System.out.println("constructor"); }
	 * 
	 * public static void main(String[] args) { System.out.println("read to
	 * construct"); Boyarsky obj = new Boyarsky(); } }
	 * 
	 *************************************************/

	/*************************************************
	 * //Page: 268 private static final String leftRope; private static final String
	 * rightRope; private static final String bench; private static final String
	 * name = "name"; static { leftRope = "left"; rightRope = "right"; } static {
	 * name = "name"; rightRope = "right"; } public static void main(String[] args)
	 * { bench = "bench"; } }
	 *************************************************/

	/*************************************************
	 * //Page: 359
	 * 
	 * public String exceptions() { String result = ""; String v = null; try { try {
	 * result += "before"; v.length(); result += "after"; } catch
	 * (NullPointerException e) { result += "catch"; throw new RuntimeException(); }
	 * finally { result += "finally"; throw new Exception(); } } catch (Exception e)
	 * { result += "done"; } return result; }}
	 *************************************************/

	/*************************************************
	 * //Page: 361 String type = "moose"; Integer number = (Integer) type; // DOES
	 * NOT COMPILE} }
	 *************************************************/

	/*************************************************
	 * //Page: 361
	 * 
	 * String type = "moose"; Object obj = type; Integer number = (Integer) obj;} }
	 *************************************************/

	/*************************************************
	 * String names[] = null; System.out.println(names);
	 * 
	 * } }
	 *************************************************/

	/*************************************************
	 * // Page:
	 * 
	 * int[][] twoD = new int[3][2]; for (int i = 0; i < twoD.length; i++) { for
	 * (int j = 0; j < twoD[i].length; j++) System.out.print(twoD[i][j] + " "); //
	 * print element System.out.println(); // time for a new row } } }
	 *************************************************/

	/*************************************************
	 * // Page:
	 * 
	 * for (int i = 1; i <= 5; i++) { for (int j = 1; j <= i; j++) {
	 * System.out.print(" x");
	 * 
	 * } System.out.println(""); } } }
	 * 
	 *************************************************/

	/*************************************************
	// Page:
	
		  public int update(int a, int offset){  
		   a = a + offset;     
		return a;   }  

	public static void main(String[] args) 
		{    
			 Updater u = new Updater();    
			 int a = 99;    
			 a = u.update(a, 111);     
			System.out.println(a);   }
	
}
*************************************************/

/*************************************************
 //Page:
	
	 public static void main(String[] args) {

		int mahnit() {
		int a = 0; int b = 0;
  try {
  return a/b;
  } catch (ArithmeticException e) {
	  return 0;
  
  } catch (RuntimeException e) {
	  return -1;
    
    
    } finally {

   System.out.println("done");
   } }
	 }
 *************************************************/

/*************************************************
 //Page:
  
 
   public static void main(String args[]){
      Stack s1 = new Stack ();
      Stack s2 = new Stack ();
      processStacks (s1,s2);
      System.out.println (s1 + "    "+ s2);
   }
   public static void processStacks(Stack x1, Stack x2){
      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
      x2 = x1;
   }
 }
   
 *************************************************/

/*************************************************
  //Page: 
   
   public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}
   } 
 *************************************************/

/*************************************************
 //Page:
  
   public static void main(String args[]){  
int a=10;  
int b=10;  
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21 
System.out.println(++a + ++a);//13 + 14 = 27
System.out.println(a-- + --b);//14 + 11 = 25
System.out.println(--a + a++ - ++a);//12 + 12 - 14 = 10
  
 
   } }
 *************************************************/

/*************************************************
  //Page:
   
    public static void main(String[] args) {  
    for(int i=1;i<=10;i++){  
        System.out.print(i+" ");  
    } 
    
    } }
 *************************************************/
	
/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/

/*************************************************
 * //Page: } }
 *************************************************/
