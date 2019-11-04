package assignments;

import java.util.Scanner;

public class sameornot_true {
	public static void main(String[] args) {
		Scanner  scr=new Scanner(System.in);
		//Ask user to enter two words. Print true is the first
		//two characters of the first word and last 
		//two characters of the second word are same characters, print false otherwise.

		System.out.println("Please enter 2 words :");
		String word1=scr.next();
		String word2=scr.next();
		int endofword2=word2.length();
		String word3=word1.substring(0,2);
		String endletter=word2.substring(endofword2);
		
		if (word3==endletter){
		System.out.println(true );
		}else {
				System.out.println(false);
			}
		}
		 
		
	}
	
	
	
		
			
	


