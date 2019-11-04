package practice;

import java.util.Scanner;

public class commonloops {//sum of grades
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many grades would you like to enter--> ");
		int grades=scan.nextInt();
		int sumofgrades=0;
		
		for (int i=1; i<=grades;i++) {
			System.out.println("Enter Grade "+i+"-->");
			int grade=scan.nextInt();
			sumofgrades+=grade;
		}
		System.out.println("The sum of the grades is:: "+sumofgrades);
	}
}
