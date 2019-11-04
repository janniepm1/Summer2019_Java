package repl_it;

import java.util.*;
import java.util.Scanner;

public class reversearrays {
public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("wirte a word");
	    String sentence = input.nextLine();
	    
	 /*   Given a String variable sentence, write code to type each word in separate lines in a reverse order.
	    Example:
	    sentence -> "Java is fun"
	    Print
	    fun
	    is
	    Java
	    */
	    
	    
	   String[] sentence1= sentence.split(" ");
	  for(int i=sentence.length()-1;i>=0;i--) {
		  System.out.println(sentence1[i]);
	  }
	  }
		   
	   }
	




