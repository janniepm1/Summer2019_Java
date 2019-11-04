package wrapperclassandarrylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayslistpractice {

	public static void main(String[] args) {
		ArrayList<String> nameList=new ArrayList<>();
		
		//add method:
					nameList.add("Cinthya");
					nameList.add("Homayra");
					
					System.out.println(nameList);
					/*
					 * create an arraylist called student names 
					 * create scanner object called scan
					 */
					Scanner scan=new Scanner(System.in);
		ArrayList<String> studentnames=new ArrayList<>();
		
		
		while (true) {
		
		System.out.println("Enter a name: ");
		String name=scan.nextLine();
		studentnames.add(name);
		
		System.out.println("Do you want to add another name? ");
		String answer=scan.nextLine().toLowerCase();
		if(!(answer.equals("yes")||answer.equals("no"))) {
			System.out.println("Invalid");
			break;
		}
		if (answer.equals("no")) {
			break;
		}
		}	
		System.out.println(studentnames + "Are the names");
					
	}
}
