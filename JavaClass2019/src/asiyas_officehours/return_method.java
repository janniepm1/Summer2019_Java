package asiyas_officehours;

import java.util.Scanner;

public class return_method {
	public static void main(String[] args) {
		//i want to call my return method 
		//there are two ways 
		//1rst:inside print method
		System.out.println(hi());
		//datatype String 2nd way
		String greeting =hi();
		System.out.println(greeting);
		//calling playgame method
		System.out.println(playgame(40));//false\
		//what datatype will playgame return
		boolean playornot=playgame(25);
		System.out.println(playornot);
		Scanner scan=new Scanner(System.in);
		System.out.println("How long does it take to play game");
		int minute=scan.nextInt();
		System.out.println(playgame(minute));
		
	}
	
	//return method=always give you one specific datatype result
	//keyword==return 
	// how to call a return method
public static String hi() {
	return "Hi, good morning";
}
 
//playgame () .provide length of the game, ill will decide if i play or not
public static boolean playgame(int minutes) {
	
	if(minutes<=30) {
		return true;
	}
	return false;
	
	
	
}
}
