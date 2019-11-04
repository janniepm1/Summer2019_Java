package day20_recap;

import java.util.Scanner;

public class taskminandmax {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		/*
		 * write a program thats asks user to enter number 10 times find the 
		 * max num
		 */
			int max=-999999;
			
			for (int i=1;i<=5;i++) {//i+=2 it will be executed only two times
			
			System.out.println("enter a number");
			int inputnum=scan.nextInt();//1
			if(inputnum>max) {
				max=inputnum;
			}
			}
	
	System.out.println("max value is :"+max);
	
	
	
	
	
	
	
	
	
	}

}
