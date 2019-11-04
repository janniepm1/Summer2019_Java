package Day21_whileLoops;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	
	
	while (true) {
	System.out.println("Please enter first number ");
	int num1=scan.nextInt();
	System.out.println("Please enter second number ");
	int num2=scan.nextInt();
	
	System.out.println("Addition is: "+(num1+num2));
	System.out.println("Do you wanna continue?");
	String answer=scan.next();
	if (answer.equalsIgnoreCase("no")) {
		break;
	}else {
		System.out.println("Completed");
	}
	
	}
}
}
