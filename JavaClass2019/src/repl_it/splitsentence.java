package repl_it;

import java.util.Scanner;

public class splitsentence {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("enter a sentence");
	    String sentence = input.nextLine();
	    
	    //type your code below
	    
	   String[] sentence1=sentence.split(" ");
	   for(int i=0;i<=sentence1.length-1;i++) {
		   System.out.println(sentence1[i]);
	   }
	}
	
}