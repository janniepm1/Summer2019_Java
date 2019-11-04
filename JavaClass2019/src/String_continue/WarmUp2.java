package String_continue;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		 * write a program that ask user to put first and last name 
		 * first letter capital rest lower case
		 * output: first upper case remaining lower case
		 * 
		 */
		System.out.println("Enter first name:");
		String firstname=scan.nextLine();
		//mUhTar
		firstname =firstname.substring(0,1).toUpperCase()
				+firstname.substring(1).toLowerCase();
		System.out.println("enter your last name");
		String lastname=scan.nextLine();
		lastname=lastname.substring(0,1).toUpperCase()
				+lastname.substring(1).toLowerCase();
		
		lastname=(""+lastname.charAt(0)).toUpperCase()+
				lastname.substring(1).toLowerCase();
		String initials=firstname.substring(0,1).concat(".")+lastname.substring(0,1);
		initials=initials.toUpperCase();
		System.out.println(firstname+" "+lastname);
		System.out.println("initials are:"+initials);
		
		
	}

}
