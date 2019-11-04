package Day22_nestedloop;

import java.util.Scanner;

public class nestedlooptask2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("do you want to do multiplication");
		String str=scan.next();
		if(str.equals("multiplication")||str.equals("addition")||str.equals("subtracction")||
				str.equals("division"));
		
		while(true) {	
		System.out.println("Enter 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Do you wanna continue?");
			scan.nextLine();
		String answer=scan.nextLine().toLowerCase();
		while( !(answer.equals("yes")||answer.equals("no"))) {
			System.out.println("Please make up ypur mind");
		}
		
		if(answer.equals("no")) {
			break;
		}
		}
		/*
		 * calculator program
		 * write a program that asks user if she wants to :*./.%.-
		 * then ask user to enter 2 nums 
		 * then return the result to console
		 * and ten ask them if they want to continue to do another mathematical proble
		 * if yes repeat previous steps if no exit the system
		 * other ask the user to re enter 
		 * 
		 */
		
		
	}

}
