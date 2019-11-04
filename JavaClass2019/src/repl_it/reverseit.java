package repl_it;

import java.util.Scanner;

public class reverseit {
	public static void main(String[] args) {
	//	Write a program that will reverse a string. Your program should 
		//reverse a string only 5 characters long. If word is shorter, display message: 
		//"Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console. 
		Scanner scan = new Scanner(System.in);
		System.out.println("write one word");
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    if (word.length()==5) {
	  System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
	}else if (word.length()<5){
		System.out.println("Too short!");
	}else {
		System.out.println("Too long!");
	}
		

}
}