package Day22_nestedloop;

import java.util.Scanner;

public class warmup2 {
	/*
	 * write a progrsm that can check if the string is plaindrome if its true
	 * "true otherwise"false"
	 * input:level
	 * true, because reverse is the same word
	 */
	public static void main(String[] args) {
		/*
		 * abba==>abba==>palindrome
		 * level==>level==>palindrome
		 * if the reverse and original equal is palindrome
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter somthing");
		String original=scan.nextLine();
			//		     01234
		//rve index=4321
		String reversed="";//"level
		//String reversed=original.charAt(i);
		for (int i=original.length()-1; i>=0;i--) {
			//initialization      ; condition; iterator
			reversed+=original.substring(i,i+1);
		
		
		//int i=original.length()-1;{
		//while(i>=0) {
			//String reversed=original.charAt(i);
		//	i--;
		
		boolean result=original.equals(reversed)?true:false;
		System.out.println(result);
		
	}

}


}