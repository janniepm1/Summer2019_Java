package day24_reviewarraysandloops;

public class warmup2 {
	public static void main(String[] args) {
		/*
		 * write a program that return the minimun value from an int array
		 * write a program that return the second value from an int array
		
		 */
		int [] arr= {100,2,2,3,4,5,6};
		int min =999999999;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("minimum number is: "+min);
		
		int secondmin=999999;
		for(int j=0; j<arr.length;j++) {
			if((arr[j]<secondmin)&&(arr[j]!=min)) {//or>than min
				secondmin=arr[j];
			}
		}
		System.out.println("Second minimum number is: "+secondmin);
	}

}
