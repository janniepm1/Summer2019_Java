package repl_it;

import java.util.Scanner;

public class Printhalftwice {
	public static void main(String[] args) {
		//Write a program that will print out first half of the word twice. 
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		   
		    //WRITE YOUR CODE HERE
		    String word1=word.substring(0,word.length()/2);
		    System.out.println(word1+word1);
		    
		  }
	}


