package returnMethod_warmup;

import java.util.Arrays;


public class warmup {
	/*
	 * Warm up:
    write a return method that accepts an int array and sorts it in descending order
    write a return method that accepts a double array and sorts it in descending order
    write a return method that accepts a char array and sorts it in descending order
    write a return method that accepts a String array and sorts it in descending order
        Hint: method overloading is preferred here

	 */
	public static void main(String[] args) {
		int[] arr= {10,89,20,300,900,10,0,1};
		arr=sortde(arr);//return int datatype
		System.out.println(Arrays.toString(arr));
		
		double[] arr2= {10.5,5.5,300, 2.0,6.5};
		arr2=sortde(arr2);//return double array value
		System.out.println(Arrays.toString(arr2));
		
		char[] ch= {'C','D','T','V'};
		ch=sortde(ch);
		System.out.println(Arrays.toString(ch));
		
		String[] name= {"Cinthya","Jim","Nina","Tim"};
		name=sortde(name);
		System.out.println(Arrays.toString(name));
		
	}
	
	
	
public static int[] sortde(int[]arr) {
	Arrays.sort(arr);//ascending order
	int[] arr2=new int[arr.length];//this new arrays can contain all the values of last array
	int j=0;
	
	for(int i=arr.length-1; i>=0;i--) {
		arr2[j]=arr[i];
				//arr2[arr.length-1-i=arr[i];
				j++;
		
	}
		return arr2;
	}
public static double[] sortde(double[]arr) {
	Arrays.sort(arr);//ascending order
	double[] arr2=new double[arr.length];//this new arrays can contain all the values of last array
	int j=0;
	
	for(int i=arr.length-1; i>=0;i--) {
		arr2[j]=arr[i];
				//arr2[arr.length-1-i=arr[i];
				j++;
	
}
return arr2;
}
public static char[] sortde(char[]arr) {
	Arrays.sort(arr);//ascending order
	char[] arr2=new char[arr.length];//this new arrays can contain all the values of last array
	int j=0;
	
	for(int i=arr.length-1; i>=0;i--) {
		arr2[j]=arr[i];
				//arr2[arr.length-1-i=arr[i];
				j++;
	
}
return arr2;
}
public static String[] sortde(String[]arr) {
	Arrays.sort(arr);//ascending order
	String [] arr2=new String[arr.length];//this new arrays can contain all the values of last array
	int j=0;
	
	for(int i=arr.length-1; i>=0;i--) {
		arr2[j]=arr[i];
				//arr2[arr.length-1-i=arr[i];
				j++;
	
}
return arr2;
}

}











