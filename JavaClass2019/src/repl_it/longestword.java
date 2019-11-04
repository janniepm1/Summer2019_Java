package repl_it;

import java.util.Scanner;

public class longestword {
	
		
		 public static void main(String[] args) {
			
			// Write a program that will print out the longest word.
		
		     Scanner scan = new Scanner(System.in);
		     System.out.println("write 2 words");
		     String word1 = scan.next();
			    String word2 = scan.next();
		    //WIRTE YOUR CODE HERE
			    
//		     int endof1=word1.length();
//		  int endof2= word2.length();
//	
		  if (word1.length()>word2.length()) {
			  System.out.println(word1 + " is bigger ");
		  }else {
			  System.out.println(word2 + " is bigger ");
		  }
		  
		  
		 }}
