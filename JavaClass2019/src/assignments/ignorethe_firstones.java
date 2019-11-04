package assignments;

import java.util.Scanner;

public class ignorethe_firstones {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		//Ask user to enter two words. Print first word without its first character then print the second word without its first character.
		//Input:apple banana

		//Output:

		//ppleanana
		System.out.println("please enter 2 words ");
		String word1=scr.next();
		String word2=scr.next();
		String word3=word1.substring(1)+word2.substring(1);
		//int word4=word1.charAt(0);
		//int word5=word2.charAt(0);
		System.out.println(word3);
		
		
		
		
	
	
	
	
	
	
	
	}

}
