package assignments;

import java.util.Scanner;

public class hourminutes {
	//n this assignment, you will write code to put together time of day.

//Like this: 12:24:33 PM
//1. Declare variables: hour, minute, second that can hold int values.
//2.  Declare amOrPm variable that can hold a String ("AM" or "PM")
//3. Using the variables and concatenation, print values in the format mentioned above.
	Scanner scan=new Scanner(System.in);
	
 
public static void main(String[] args) {
	
	int hours=12;
	int minute=24;
	int seconds=33;
	String day="AM";
	String night="PM";
	
	String hour2=""+hours+":"+minute+":"+seconds+" ";
	if (hours>12) {
		System.out.println(hour2.concat("PM"));
		
		
	}else {
		System.out.println(hour2.concat("AM"));
	
	
}
 

}
}
