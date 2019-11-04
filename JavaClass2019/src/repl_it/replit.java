package repl_it;

import java.util.Scanner;

public class replit {
	public static void main(String[] args) {
		
	
	 String firstName, lastName, fullName, email, street, state, city, address, contacts;
	  int age,zipcode;
	  double height, weight;
	  boolean isMarried;
      long workPhoneNumber,personalPhoneNumber;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Welcome to the patient portal!");
	  System.out.println("Please enter your personal information");
	 
	  System.out.println("Enter your first name");
	   firstName=scan.nextLine();
	  System.out.println("Enter your last name");
	   lastName= scan.nextLine();
	   System.out.println("Enter your email");
	   email=scan.nextLine();
	   System.out.println("Enter your street");
	   street=scan.nextLine();
	   System.out.println("Enter your city");
	   city=scan.nextLine();
	   System.out.println("Enter your State");
	   state=scan.nextLine();
	   System.out.println("Enter your zipcode");
	   zipcode=scan.nextInt();
	   System.out.println("Enter your work phone number");
	   workPhoneNumber=scan.nextLong();
	   System.out.println("Enter a personal phone number");
	   personalPhoneNumber=scan.nextLong();
	   System.out.println("Enter your age");
	   age=scan.nextInt();
	   System.out.println("Enter your haight");
	   height=scan.nextDouble();
	   System.out.println("Enter your weight");
	   weight=scan.nextDouble();
	   System.out.println("Are you married?");
	   isMarried=scan.hasNext();
	   
	   contacts= ("work phone number - " + workPhoneNumber + ", personal phone number"+"-"+ personalPhoneNumber);
	   fullName=(firstName+" , "+lastName );
	   address=(street+" "+city+" "+state+" "+zipcode);
	   
	   System.out.println(fullName);
	   System.out.println(address);
	   System.out.println(contacts);
	   System.out.println(age);
	   System.out.println(height);
	   System.out.println(weight);
	   System.out.println(isMarried);
	   
	   
	   
	   
	   
	  
	 
	  
 
	  
	  
}}  	