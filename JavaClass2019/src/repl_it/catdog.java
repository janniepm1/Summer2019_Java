package repl_it;

import java.util.Scanner;

public class catdog {
	public static void main(String[] args) {
		/*
		 * Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
Example:
input: catdog
output: true
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("write a word");
		 int countOfCats = 0;
		    int countOfDogs = 0;
		    String word = scan.next();
		    while(word.contains("cat")) {
		    	word=word.replaceFirst("cat", " ");
		    	countOfCats+=1;
		    	
		    }
		    	while(word.contains("dog")) {
		    		word=word.replaceFirst("dog"," ");
		    		countOfDogs+=1;
		    	}
		    
		    if(countOfCats==countOfDogs) {
		    	System.out.println("True");
		    }else {
		    	System.out.println("False");
		    }
		    
		    
	}
}


