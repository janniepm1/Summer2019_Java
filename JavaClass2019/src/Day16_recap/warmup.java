package Day16_recap;

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your First name and last name");
		String firstname=scan.nextLine().toUpperCase();
		String lastname=scan.nextLine().toUpperCase();
				
		String fullname= firstname+" "+lastname;
		System.out.println("your full name is: "+fullname);
		fullname=fullname.toUpperCase();//you have to convert it again fullname =fullname
		System.out.println("ypur full name is: "+fullname);
		fullname=fullname.toLowerCase();
		System.out.println("your full name is: "+ fullname);
		
		String fullname1=firstname.concat(lastname);
		System.out.println("your full name is :"+fullname1 );
		
		
		
		
		
	}
	

}
