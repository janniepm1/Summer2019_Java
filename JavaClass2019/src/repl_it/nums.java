package repl_it;

import java.util.Scanner;

public class nums {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter 2 numbers: ");
		num1=scan.nextInt();
		num2=scan.nextInt();
		scan.nextLine();
		
		if (num1==num2) {
			System.out.println(num1+" and"+num2 +" are equal" );
	
	}if (num1>num2) {
		System.out.println(num1 +"is greater than "+ num2);
	
	}if (num2>num1) {
		System.out.println(num2+" is greater than "+num1);
	}
		
	}
}
