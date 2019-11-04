package Day15Scanner_StringClass;

import java.util.Scanner;

public class next_line_2 {
	public static void main(String[] args) {
		/* 
		 * write a program that accepts xip code ,city ,state, phone number 
		 * and then displayed all those gathered info 
		 * do not use next() method 
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your zip code:");
		int zipcode=input.nextInt();
		//1629081 will be saved in the scanner method\
		input.nextLine();
		System.out.println("please enter your city name:");
		String cityname=input.nextLine();
		
		
		System.out.println("zip code is:"+zipcode);
		System.out.println("city name is:" +cityname);
		System.out.println("Enter your phone number");
		int pn=input.nextInt();
		input.nextLine();
		
		System.out.println("enter the state name");
		String statename=input.nextLine();
		

		System.out.println("zip code is" +zipcode);
		System.out.println("city name is "+cityname);
		System.out.println("state name is " +statename);
		
		
		
	}

}
