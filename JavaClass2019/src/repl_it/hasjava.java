package repl_it;

import java.util.Scanner;

public class hasjava {
	public static void main(String[] args) {
	/*	Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with 
	 * "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
				Example:
				input: javapython
				output: true
				*/
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter a word");
	    String word = scan.next();
	     
int lngt = word.length();
	    
	    if (lngt>=4) {
	    
	        if (word.substring(0,3).equals("jav") || word.substring(1,4).equals("jav")) {
	        System.out.println(true);
	        } else {
	        System.out.println(false);
	        }
	      
	      
	    }
	    if (lngt <=3) {
	      System.out.println(false);
	    }
	  }
	}