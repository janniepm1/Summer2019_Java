package repl_it;

import java.util.Scanner;

public class count55 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("enter nums");
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO Type your code below:
	    int count = 0;
	    for (int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] == 5 && nums[i + 1] == 5) {
	                
	                count ++;
	                
	}
System.out.println(count);
}
	    
	    if (count >=1) {
		     System.out.println(true);
		   } else {
		     System.out.println(false);
		   }
		  }
}