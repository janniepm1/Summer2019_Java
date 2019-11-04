package repl_it;

import java.util.Scanner;

public class repeatseparator {
	public static void main(String[] args) {
	/*	Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
	 *  separated by the separator string.
				Example:
				input: Word
				input: X
				input: 3
				output: WordXWordXWord
*/
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a word");
		
		String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    String newWord="";
	    
	    for(int i=0;i<count-1;i++) {
	    	if(i<count) 
	    		newWord+=word+separator;
	    	
	    	else 
	    		newWord+=word;
	    		System.out.println(newWord);
	    	}
	    }
	    
	}

	  
		
	


