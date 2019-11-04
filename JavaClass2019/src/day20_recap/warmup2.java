package day20_recap;

import java.util.Scanner;

public class warmup2 {
	/*write a program that ask user to enter number 5 times 
	 * find the sum of those 5 inputs 
	 * find the maximun number and the minimun number
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int min=9999999;// the minimum user input value. if you want to print min write the maximum
		
for (int i=1;i<=5;i++) {//i+=2 it will be executed only two times
			
			System.out.println("enter a number");
			int inputnum=scan.nextInt();//100,50,300,1,-99
			if(inputnum<min) {
				min=inputnum;
			}
			}
	
	System.out.println("min value is :"+min);
	
			
		}
	}


