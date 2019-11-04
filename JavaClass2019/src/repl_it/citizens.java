package repl_it;

import java.util.Scanner;

public class citizens {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int seniorCitizens;
		int nonseniorCitizens;
		int age;
	System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens");
	seniorCitizens= scan.nextInt();//
	nonseniorCitizens=scan.nextInt();//
//	if(seniorCitizens >= 65) {
//		System.out.println("Senior Citizen");
//	
	System.out.println("What is new citizen's age?");
     age = scan.nextInt();
     if(age >= 65) {
 		System.out.println("Senior Citizen");
 		seniorCitizens = seniorCitizens + 1;
        System.out.println("age is: " + seniorCitizens);

     }
     System.out.println("Non-Senior Citizen");
     nonseniorCitizens = nonseniorCitizens +1;
     System.out.println("age is: " + nonseniorCitizens);
    	 
     	 
     System.out.println("New seniorCitizens count:"+ seniorCitizens);
     System.out.println("New Non-seniorCitizens count:"+ nonseniorCitizens);
     
     
	}
}
