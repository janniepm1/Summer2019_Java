package repl_it;

import java.util.Scanner;

public class findmidnumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter first number: ");
		num1=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter second number: ");
		num2=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter third number: ");
		num3=scan.nextInt();
		scan.nextLine();
		
		if (num2>num1 &&num1>num3||num3>num1&&num1>num2) {
			System.out.println(num1+" is the middle number");
		} if(num1>num2 && num2>num3||num3>num2 &&num2>num1); {
				System.out.println(num2+" is a middle number");
			} if (num1>num3 &&num3>num2||num2>num3 &&num3>num1);{
				System.out.println(num3+" is a middle number");
			}
		}
		
		
	}


