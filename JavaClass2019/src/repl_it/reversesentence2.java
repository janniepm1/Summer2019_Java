package repl_it;

import java.util.Scanner;

public class reversesentence2 {
	public static void main(String[] args) {
		/*
		 *Given a String variable sentence, write code to get each word and assign to String reversed in reverse order. 

Example:
sentence -> "Java is fun"
reversed -> "fun is Jav
		 */
		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    String reversed = "";
		    //TODO: start your code here
		    String [] sentence1 = sentence.split(" ");
		    
		    
		      for (int i = sentence1.length-1; i >= 0; i--) {  
		          
		            reversed +=sentence1[i] + " ";
		  }
		    reversed = reversed.substring(0,reversed.length()-1);
		    //End your code here. do not modify below statement
		    System.out.println(reversed);
		    

		    
		    
		    //End your code here. do not modify below statement
		    System.out.println(reversed);
		    
	}

}
