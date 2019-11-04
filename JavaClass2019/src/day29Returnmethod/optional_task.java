package day29Returnmethod;

import java.util.Arrays;



public class optional_task {
	public static void main(String[] args) {
		String[] names= {"wariis","cinthya","gulnur","tim"};
		String longname=longstname(names);
		System.out.println(longname);
		
		int[] arr= {1,2,3,4,5,6,7,8};//8 7 6 5 4 3 2 1		
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
		}
	/*
	 * write a method that accepts string array,and returns the longest String value 
	 * from the array
	 */
public static String longstname(String []arr) {
	String longword="";
	
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i].length()>max) {
			max=arr[i].length();
			longword=arr[i];
		}
	}
	return longword;
}//write a method that accepts an int arrays and sorts it then returns an array	
	
	public static int[] sort(int[] arr) {
		Arrays.sort(arr);
		int[] numbers=new int[arr.length];//array has same length with the arr
		int z=0;
		for(int i=arr.length-1;i>=0;i--) {
			numbers[z]=arr[i];
			z++;
		}
		return numbers;
		
	}
	
	
	
	
	
	
	
	
	
}












