package Day27_customMethods;

import java.util.Arrays;

public class WarmUp {
	//create an int array called numbers with a length of 100
	//assign 1-100 to the array indexes 
	//use for each loop loop print out even nums
	//must use continious statement
	
	public static void main(String[] args) {
	int[] numbers;
	 numbers=new int[100];
		
	 for(int i=1;i<=100; i++) {//if want to assign from 0 i=0 and less than 100
		 numbers[i-1]=i;//i-1 equal 0 , each value of "i" will be assigned to the index
		 //numbers[0] =1
		 //numbers[1]=2
		 
	 }
	 System.out.println(Arrays.toString(numbers)+",");
		 for(int each:numbers) {
			 if(each%2!=0) {//1%2 !=0 ==true
				 continue;
			 }System.out.print(each+" ");
			 
		 }
		  }
	
		
	
		
		}	
		
	
		
		
		
		
		
		
		
		
		
			


