package repl_it;

import java.util.Scanner;

public class mergethem {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("write 2 words");
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		   //You have 2 words, both of them have 3 characters.
		    //If either of them does not have exactly 3 characters, print "cannot merge"
		  //  Merge their characters one by one and print together like below
		  
		    if((word1.length()==3)&&word2.length()==3) {
		    System.out.println(""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)
		    
		    +word1.charAt(2)+word2.charAt(2));
		   
              }else {
              
            	  System.out.println("cannot merge");
              }
	}

}
