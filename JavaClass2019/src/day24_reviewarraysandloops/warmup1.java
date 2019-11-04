package day24_reviewarraysandloops;

public class warmup1 {
	public static void main(String[] args) {
		/*
		 * write a program that can return the max value of an int array
		 * write a program that can return the second max value from an int array
		
		 */
		
		//returns maximum number
		int [] arr= {20,200,30,40,50,500};
		int max=0;//max=20 then 200 then 30 .....
		for(int i=0; i< arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum  number is: "+max);
		
		
		int secondmax=0;
		for(int j=0; j< arr.length;j++) {
			if(arr[j]> secondmax && arr[j] !=max) {
				secondmax=arr[j];
				
				}	
		}
		System.out.println("Second maximum number is : "+secondmax);
		
		
		
		
		}		
	}


