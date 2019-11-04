package repl_it;

import java.util.Scanner;

public class Arraysprintfristandlastchar {
	public static void main(String[] args) {
		
	
	 Scanner input = new Scanner(System.in);
	 System.out.println("enter words");
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   String words2="";
for(String each:words) {
	 words2 += "" + (each.substring(0,1)  + each.substring(each.length()-1)) + ", ";
//	System.out.println(each.substring(0,1)+each.substring(each.length()-1));
}
//words2=("["+words2.substring(0,words.length-1)+"]");

	System.out.print("["+words2+"]");
}
}