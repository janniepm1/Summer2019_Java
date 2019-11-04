package Day23_Arrays;

import java.util.Scanner;

public class warmuotaskarrays {
	public static void main(String[] args) {
		//write a program that can divide two nums without using divison operator
		// write a program that can fins the uniqu echars from a string
		//input:aaabcdefff
		//output:bcd
		
		int a=10;
		int b=3;
		System.out.println(a/b);//regular way to do it but how to do it without using divional operator
	
	
		/*
		 * 10-3=7
		 * 7-3=4
		 * 4-3=1
		 */
		int x=20;
		int y=6;
		int count=0;
		while(x>=y) {
			x-=y;
			count++;
		}System.out.println(count);//result after dividinf two nums
		System.out.println(20/6);
		System.out.println(x);//remainder
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter 2 nums ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		
		if (num2!=0) {
		int result=0;
		//		10>=3
		while(num1>=num2) {
			num1-=num2;
			result++;
		}
		System.out.println("division is: "+result);
		System.out.println("with a remainder of: "+num1);//is changed by the original value
		
		
		}else {
			System.out.println("invalid entry");
		}
	
	}
}
	
	
	



