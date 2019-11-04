package repl_it;

import java.util.Scanner;

public class duplicateit {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    //String word1 = scan.next();
	   // String word2 = scan.next();
	    //YOUR CODE HERE
	    System.out.println("write 2 words");
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    
		  
		   String sentence1=word1.concat(word2);
		   String sentence2=word2.concat(word1);
		    
		   System.out.println(sentence1+sentence2);
		    
}
}
