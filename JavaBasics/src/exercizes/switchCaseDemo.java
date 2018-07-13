package exercizes;
public class switchCaseDemo {
	
	/***************************************************************************

	
	public static void main(String[] args) {
		
		
		int x = 20;
		while(x>0) {
		do {
		x -= 2;
		} while (x>5);
		x--;
		System.out.print(x+"\t");
		}
	}}
**********************************************************************************/

/*********************************************************************************
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		case 0:
		System.out.println("Sunday");
		default:
		System.out.println("Weekday");
		case 6:
		System.out.println("Saturday");
		break;
***********************************************************************************/

/**********************************************************************************


		private int getSortOrder(String firstName, final String lastName) {
			String middleName = "Patricia";
			final String suffix = "JR";
			int id = 0;
			switch(firstName) {
			case "Test":
			return 52;
***********************************************************************************/

/**********************************************************************************

			
			case middleName: // DOES NOT COMPILE
				id = 5;
				break;
				case suffix:
				id = 0;
				break;
				case lastName: // DOES NOT COMPILE
				id = 8;
				break;
				case 5: // DOES NOT COMPILE
				id = 7;
				break;
				case 'J': // DOES NOT COMPILE
				id = 10;
				break;
				case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
				id=15;
				break;
				}
				return id;
***********************************************************************************/



/**********************************************************************************
 public static void main(String[] args) {
int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
int searchValue = 2;
int positionX = -1;
int positionY = -1;
PARENT_LOOP: for(int i=0; i<list.length; i++) {
for(int j=0; j<list[i].length; j++) {
if(list[i][j]==searchValue) {
positionX = i;
positionY = j;
break PARENT_LOOP;
}
}
}
if(positionX==-1 || positionY==-1) {
System.out.println("Value "+searchValue+" not found");
} else {
System.out.println("Value "+searchValue+" found at: " +
"("+positionX+","+positionY+")");
}
}
}

***********************************************************************************/

	  
/**********************************************************************************/
   public static void main(String[] args) {
	

	String [] programmers = {"Outer", "Inner"};
   for (String outer : programmers) {
     for (String inner : programmers) {
       if (inner.equals("Inner"))
         break;
    System.out.print(inner + ":");
      }
    }}}
	 

/***********************************************************************************/


				
		
	
	
	
	

