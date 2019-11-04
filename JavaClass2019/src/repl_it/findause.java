package repl_it;

import java.util.Scanner;

public class findause {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*Assume that you have only 2 users: Max Payne and Alan Wake.  First, 
		 * ask user to enter full name. Display message: "Enter full name:".
		 *  Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", 
		 *   display message: "User found!". Otherwise,  display message: "User not found!". Please make your search case insensitive!

		Example:
		Display message: Enter full name:
		input: Max Payne
		Display message: User found!\
		*/

		
		System.out.println("Enter full name:");
	    String user1 = scan.nextLine();
	    String name1 = "Max Payne";
	    String name2 = "Alan Wake";
	        boolean name11 = user1.equalsIgnoreCase(name1);
	        boolean name22 = user1.equalsIgnoreCase(name2);
	        
	    
	        
	        if(name11 || name22) {
	    //  if(name1.equals(user1) || name2.contentEquals(user1)) {
	            System.out.println("User found!");
	        }else {
	            System.out.println("User not found!");
	        }
	        
	}
}
