package day20_recap;

import java.util.Scanner;

public class warmup3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int min=9999999;//initialize the min value for min give large num for max give 0 or -
		
		for(int i=1;i<=5;i++)	{
			System.out.println("Enter a number");
			int inputnum=scan.nextInt();
			if(inputnum<min) {//1,7,-999,2000
				min=inputnum;
			}
			
		}
		System.out.println("min value is: "+min);

}
}