package Day15Scanner_StringClass;

import java.util.Scanner;

public class warm_up {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first and last name ");
		String firstname=scan.nextLine();
		String lastname=scan.nextLine();
		String fullname=firstname.concat(" "+lastname);
		int num   =  fullname.length();
		System.out.println(fullname+" contains "+num+" characters");
		int lastindexnum=fullname.length()-1;
		System.out.println(fullname.charAt(lastindexnum));
		
		scan.close();
	}

}
