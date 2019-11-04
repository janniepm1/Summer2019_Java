package Day15Scanner_StringClass;

import java.util.Scanner;

public class nextline {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your phone number:");
	int pn=scan.nextInt();
	System.out.println(pn);
	scan.nextLine();
	//12345 enter
	System.out.println("Enter your name");
	String name=scan.nextLine();

	//nextline will take everything in scanners memory
	//(including "enter")up to the new line
	
	/*
	 * nextline()method will take everything in scanner memory up to the new line 
	 * 
	 */
	
	
}
}
