package repl_it;

import java.util.Scanner;

public class vehicle_recall {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int vehicleyear;
		System.out.println("Enter vehicle's Years ");
		vehicleyear=scan.nextInt();
		scan.nextLine();
		/*
		 * SDET Motors Inc. is recalling all vehicles from model years 1995-1998,
		 *   2001-2002,  2004-2006 and 2015-2017. 

In this assignment you will write a program that will find vehicle for recall. 
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"
		 */
		if ((vehicleyear==1995)||(vehicleyear==1996)||(vehicleyear==1997)||(vehicleyear==1998)||(vehicleyear==2001)||(vehicleyear==2002)||
				(vehicleyear==2004)||(vehicleyear==2005)||(vehicleyear==2006)||(vehicleyear==2015)||(vehicleyear==2016)||(vehicleyear==2017)) {
			System.out.println("Your vehicle needs to be recall");
		} else {
			System.out.println("Your vehicle is fine, enjoy!");
		}
		
		
		
		
	
	}

}
