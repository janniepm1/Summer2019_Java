package day20_recap;

import java.util.Scanner;

public class warmup4 {
	
/* write a minimum num
 * 
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("enter your number ");
			int inputnum=input.nextInt();
			sum+=inputnum;
		}
			System.out.println("sum is: "+sum);
			
	}
}
