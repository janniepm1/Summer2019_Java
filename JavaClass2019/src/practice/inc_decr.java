package practice;

import java.util.Scanner;

public class inc_decr {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("write your first numbers:");
	    int num1=input.nextInt();
	    System.out.println("write your second numbers:");
	    int num2=input.nextInt();
	    System.out.println("write your third numbers:");
	    int num3=input.nextInt();
	    
	    
	    if (num1>num2&& num2>num3) {
	    	System.out.println("Your numbers are decreasing");
	    	}else if (num1<num2 && num2<num3) {
	    		System.out.println("Your numbers are increasing");
	    		
	    	}else {
	    		System.out.println("Neither");
	    	}
	    		
	    
	  //  System.out.println("Write second numbers :");
	  //  int num=input.nextInt();
	  //  System.out.println("Write third numbers :");
	  //  int nume=input.nextInt();
	    
		
		
		
	}

}
