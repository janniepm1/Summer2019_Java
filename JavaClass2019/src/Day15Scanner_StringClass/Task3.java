package Day15Scanner_StringClass;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		/* wriite a program that ask user to enter first name and then last name . at the end system shoul
		 * display first and last name 
		 *

		 */

	Scanner input=new Scanner(System.in);
	System.out.println("Enter your first name: ");
	String name=input.nextLine();
	System.out.println("Enter your lastname: ");
	String lastname=input.nextLine();
	String fullname= lastname+" "+name;
	System.out.println("Your full name is: "+ fullname);
	System.out.println("Enter char value");
	char c=input.next().charAt(0);
	
	
	input.close();//gets rid of warning of the scanner class
	
	
	
	
	}
	
	
	

}
