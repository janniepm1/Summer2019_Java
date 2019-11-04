package repl_it;

import java.util.Scanner;

public class timesjava {
	public static void main(String[] args) {
		
	
/*
 * Return the number of times that the string "java" appears anywhere in the given string word.

 */
	 Scanner scan= new Scanner(System.in);
	 System.out.println("enter a word");
	    String word = scan.next();
	   
	    int count=0;
	  
	   
	     for(int i=0; i<word.length()-3;i++) {
	    	 if(word.substring(i,i+4).equals("java")) {
	    	 count++;
	    	  
	    	 }
	    	
	     }
	     System.out.print(count);	 
	  
}}
