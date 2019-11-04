package repl_it;

import java.util.Arrays;
import java.util.Scanner;

public class LastcharArray {
	/*
	 * Given a String array words, iterate through each word and print first and last letter of 
	 * each element in the format below.
	 * Example:
words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne] 
*/public static void main(String[] args) {
	

	    Scanner input = new Scanner(System.in);
	    System.out.println("write some words");
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   String[] str=new String[words.length];
	   for( int i=0; i<words.length;i++) {
		   str[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
	   }
	   System.out.println(Arrays.toString(str));
	  
	   }
	  
		  
}

