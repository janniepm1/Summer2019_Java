package repl_it;

import java.util.Scanner;

public class FindingmaxlengthinArray {
	/*
	 * Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
	 */

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter wrods");
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			int index=0;
			int element=words[0].length();
			for(int i=0;i<words.length;i++) {
				if(words[i].length()>element) {
					index=i;
					element=words[i].length();
				}
			}
			System.out.println(words[index]);
	}
}
