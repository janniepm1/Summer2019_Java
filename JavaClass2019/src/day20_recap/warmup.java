package day20_recap;

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		/*
		 * find the sum of all numbers between 1 to 1000
		 * all even nummbers betw 1 to 1000
		 * all odd nums betw 1 to 1000
		 */
			//int sum=1+2+3+4+5........
		/*
		 * for(initialization;condition;iterator)
		 * if its true it will not stop
		 */
		int sum1=0;
		for (int i=1;i<=1000;i++) {//1;1-1000
			sum1+=i;
		}
		System.out.println("sum of all nums: "+sum1);
		
	//task2
	int sum2=0;
	 for (int i=1;i<=1000;i++) {//1;1-1000
		if (i%2==0) {
			sum2+=i;
		
		}
	 }//print outside the curling brace if not will execute 1-0000 times
		System.out.println("sum of all even numbers:"+sum2);
		
		
		
		int sum3=0;
		for(int i=2;i<=1000; i+=2) {
	sum3+=i;
			
			
			//task3:
			int sum4=0;
			for(i=1;i<1000; i++) {
			if (i%2==1) {
				sum4+=i;
			}
		
	 }System.out.println("sum of all odd numbes: "+sum4);
}
		int sum4=0;
				for(int i=1;i<=1000;i+=2 ) {
					sum4+=i;
				}System.out.println("sum of all numbers:"+sum4);
		
		
		
		
	}
}
