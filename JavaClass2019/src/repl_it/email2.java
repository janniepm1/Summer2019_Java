package repl_it;

import java.util.Scanner;

public class email2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
	/*
	 * Write a program that will print out information 
	 * about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
	 */
		System.out.println("Enter an email:");
		String email=scan.nextLine();
		//i need to cut name until@
		//i need to get everything after@
		//substring(0,?)
	 	//int emailid=email.indexOf('@');//5 asiya
	
	//String id=email.substring(0,emailid);
		//System.out.println("email id is "+id);
		//String domain=email.substring(emailid+1);
		//System.out.println("email domain is"+domain);
		
		int underscore=email.indexOf('_');

	//String firstname=email.substring(0,name);
	 int at=email.indexOf('@');
	 int dot=email.indexOf('.');
	 
				
	System.out.println("First name: "+email.toUpperCase().charAt(0)+email.substring(1,underscore));
	System.out.println("Last name: "+email.toUpperCase().charAt(underscore+1)+email.substring(underscore+2,at));
	System.out.println("Domain: "+email.substring(at+1, dot));
	System.out.println("Top-Level Domain: "+email.substring(dot+1));
	
		
		   
		  
		  
		
		

}
}