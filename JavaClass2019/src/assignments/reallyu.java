package assignments;

import java.util.Scanner;

public class reallyu {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		//Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.

		//Input:SeriouslyOutput:really
		System.out.println("Please enter a word");
		String word1=scr.nextLine();
		if (word1.endsWith("ly")) {
			System.out.println("really ?");
		}else {
			System.out.println("never mind");
		}
		
			
			
		}
		
		
	}


