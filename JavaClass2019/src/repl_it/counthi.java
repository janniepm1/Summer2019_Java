package repl_it;

import java.util.Scanner;

public class counthi {
//	Print out the number of times that the string "hi" appears anywhere in the given string.
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter a word");
	    String str = scan.nextLine();
	   int count=0;
	    for(int i=0; i<str.length()-1;i++) {
	    	if(str.substring(i,i+2).equals("hi")) {
	    		count++;
	    	}
	    }
	
	System.out.println(count);
	
	
	
}
}
