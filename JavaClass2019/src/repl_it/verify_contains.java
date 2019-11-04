package repl_it;

import java.util.Scanner;

public class verify_contains {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Write a sentence ");
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	  //  Write a program that will verify if word contains in the sentence. Print out the result as boolean value. 
	   boolean b=false;
	   if ((sentence.contains(word))) {
		   System.out.println(!b);
	   } else 
		   System.out.println(b);
	  
	    
	    
}
}
