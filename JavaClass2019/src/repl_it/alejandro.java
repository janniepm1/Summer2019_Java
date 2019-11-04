package repl_it;

import java.util.Scanner;

public class alejandro {
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		    String a = s.nextLine();

		    //your code here


//he wants to write a program that gets a string (the email) and determines if his name "alejandro"
//appears in that string. if so it will output "read this mail" else it will output "dont read".

		   
		 if(a.contains("alejandro")) {
			 System.out.println("read this email");
		 }else {
			 System.out.println("dont read");
		 }
		    
	}
	}