package repl_it;

import java.util.Scanner;

public class countingtriplets {
	/*
	 * We'll say that a "triple" in a string is a char appearing three times in a row. 
	 * Print out the number of triples in the given string. The triples may overlap.
Example:
input: abcXXXabc
output: 1
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Write a word");
		    String str = scan.next();
		    int count = 0 ;
		    //WRITE YOUR CODE HERE
		    
		  
		    for(int i=0;i<str.length()-3;i++) {
		    	if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)) 
		    	count++;
		    }
		    	System.out.println(count);
		    }
	}


