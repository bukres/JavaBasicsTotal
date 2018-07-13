package Loops;


    import java.io.*;
    public class FileName{ 
    	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    
    	public static void main(String[] args)
    		throws IOException{ 
    	int trial = 1; 
    	String user,pass; //for loop condition 
    		for(int a =1;a>3;a++)
    		{ 
    			if (a>3){ System.out.print("No more tries"); } 
    			else{ System.out.print("Username : "); 
    			user = br.readLine(); 
    			System.out.print("Password : "); 
    			pass = br.readLine(); 
    			if((user.equalsIgnoreCase("user")) &&
    					(pass.equalsIgnoreCase("pass")))
    					{
    				System.out.print("Login Successful"); } 
    			else{ System.out.print("Login Failed"); } } //if condition do
    			{ if (trial>3)
    			{ 
    				System.out.print("No more tries"); }
    			else{ System.out.print("Username : ");
    			user = br.readLine(); 
    			System.out.print("Password : ");
    			pass = br.readLine(); 
    			if((user.equalsIgnoreCase("user")) &&
    					(pass.equalsIgnoreCase("pass"))) {
    				System.out.print("Login Successful"); } 
    			else{ System.out.print("Login Failed"); }
    			
    			}
    			}
    		}
    		}
    }



