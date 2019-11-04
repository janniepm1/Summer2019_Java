package Day15Scanner_StringClass;

import java.util.Scanner;

public class StringScanner {
	
	//next() vs nextline==returns string value 
	//nextline returns the entire user input as string value
	//next:take the first word
public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter your first name");
	 String firstname=scan.nextLine();
	 System.out.println("Enter your last name");
	 String lastname=scan.nextLine();
	 System.out.println("first name is:"+firstname);
	 System.out.println("last name is:"+lastname);
	 
	 
}
}
