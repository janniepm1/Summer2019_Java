package repl_it;
import java.util.Scanner;
public class firstlast {
	public static void main(String[] args) {
		
	
	 Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	   System.out.println("enter your  word");
	    String word = scan.next();

	   char x =  word.charAt(0);
	   int y = word.length()-1; 
	   char z = word.charAt(y);
	   System.out.print(word.charAt(0)+""+word.charAt(y));
}
}