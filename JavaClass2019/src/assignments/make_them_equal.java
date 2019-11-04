package assignments;

import java.util.Scanner;

public class make_them_equal {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		 * Ask user to enter two words. If they are equal length, print them together. 
		 * If one is longer than the other one,
		 *  print equal number of characters from the long one.
	Input:
	book
	pen
	Output:
	boopen
		 */
		
		System.out.println("Please enter 2 words");
		String word1=scan.next();
		String word2=scan.next();
		
		
		if (word1.length()==word2.length()) {
			System.out.println(word1+ word2);
		}else {
				System.out.println(word1.substring(0,word2.length()).concat(word2));
				
			}
		
		}

		
	}


