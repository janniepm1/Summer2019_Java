package Day_26for_each;

import java.util.Arrays;

public class For_Each {
	/*
	 * syntax:
	 * 			for(datatype each: Arrayname){
	 * 
	 * 
	 * 	 */
public static void main(String[] args) {
	//for each loop
	//used to access the value in a collection of values
	//its a loop thats already been iterated. for each loop can never be infinite
	
	int[] arr= {1,2,3,4,5};
	for(int i=0; i<arr.length; i++) {
		
		System.out.print(arr[i]);
	}
	System.out.println("===========");
	for(int each:arr) {
		System.out.print(each);
	}
	System.out.println();
	String[] str1= {"Maria","Cintya","Tim","Nina"};
	for(String each: str1) {
		System.out.println(each);
	}
	System.out.println();
	char[] ch= {'z','x','y','c','a','b'};
	Arrays.sort(ch);
	for(char  each:ch) {
		System.out.print(each);
	}
	System.out.println();//print even numbs
	int[] arr1= {1,2,3,4,5,6,7,8,9,10};//nums%2>0 odd nums or nums%2!=0
	for(int nums:arr1)
	if(nums%2==0)//even nums
	 {
		System.out.print(nums+" ");//print even nums 
	}
	//print put 1-100 cannot use for each loop 
	System.out.println();
	
	
	
	
	
	
}
}
