package repl_it;

import java.util.Scanner;

public class findnondups {
	public static void main(String[] args) {
		
		/*Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
Example:
nums -> [1, 1, 2, 3, 4, 3, 4]
         2

		*/
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter nums");
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    for (int i = 0; i < nums.length; i++) {
		 	   int onlyone = nums[i];
		 	   boolean repeated = true;
		 	   for (int in = 0; in<nums.length; in++){
		 	     if(nums[in] == onlyone && i != in){
		 	       repeated = false;
		 	       break;
		 	     }
		 	   }
		 	   if (repeated) {
		 	     System.out.println(onlyone);
		 	   }
		 	 }
		 	 
		 	 
		 	 int count = 0;
		 	   for ( int i = 0; i< nums.length; i++){
		 	     for ( int j = 0; j< nums.length; j++)
		 	     {
		 	       if( nums[i] == nums[j]){
		 	         count++;
		 	       }
		 	     }
		 	       if (count ==1){
		 	     //    System.out.print(nums[i]);
		 	       }
		 	       count =0;

		 	 
		 	   }
		 	  }
		 	}
		    	
		    
