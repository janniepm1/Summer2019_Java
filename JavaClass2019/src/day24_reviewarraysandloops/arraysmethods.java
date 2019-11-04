package day24_reviewarraysandloops;

import java.util.Scanner;

public class arraysmethods {
	public static void main(String[] args) {
		
		/*
		 * ask user to enter 5 nums, then find the sum of those 
		 * 5 nums 
		 * MUST USE ARRAY
		 */
		
		int[] numbers=new int[5];//lest you enter the num 5 or 30 nums or whatver number 
		Scanner scan=new Scanner(System.in);
		
		//for first enter number to least int i=numbers.lenght-1;i>=0;i--
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Enter a Number " );
						numbers[i]=scan.nextInt();//assign user input to arrays indexes
		}int sum=0;
		for(int i=0; i<numbers.length;i++){
			sum+=numbers[i];
			
		}
		System.out.println(sum);
		}
		/*
		 * ask user to enter 5 names.then return the longest name
		 */
		String[] names= {"seyfo","Asiya","Myra","Keteryna","Daulette"};
		String LongestName="";
		int max=0;{
		for(int i=0; i<names.length;i++) {
			if (names[i].length()>max) {
				max=names[i].length();
				LongestName=names[i];
		}
		}	
		System.out.println(max);
		System.out.println(LongestName
				);
}
}