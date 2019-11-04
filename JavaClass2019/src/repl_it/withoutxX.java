package repl_it;

import java.util.Scanner;

public class withoutxX {
	public static void main(String[] args) {
		/*Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
		 *   otherwise print the string unchanged. 

		Example: 
		input: xHiX 
		output: Hi
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("write a word");
	    String word = scan.next();
	    
	    if((word.charAt(0) == 'x' || word.charAt(0) == 'X' ) && (word.charAt(word.length()-1) == 'x' 
	    	    || word.charAt(word.length()-1) == 'X')){
	    	      System.out.println(word.substring(1, word.length()-1));
	    	    }
	    	    else if(word.charAt(0) == 'x' || word.charAt(0) == 'X' ){
	    	      System.out.println(word.substring(1));
	    	    }
	    	    else if (word.charAt(word.length()-1) == 'x' 
	    	    || word.charAt(word.length()-1) == 'X') {
	    	      System.out.println(word.substring(0, word.length()-1));
	    	    }else 
	    	    System.out.println(word);
	    	  }
}