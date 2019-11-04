package day29Returnmethod;

import java.util.Arrays;

public class methodoverloading {
	//overloading :same method name, different parameters
	public static void main(String[] args) {
		
		int result=sum(10, 20, 30);
		System.out.println(result);
		System.out.println(sum(10, 30));
		System.out.println(sum(.5, 1.9, 4.5, 5.4));
		//overload method example
	//arrays sort are example of overload
		int[] arr= {1,2,3,4,5,6};
		sort(arr);
		char[] ch={'a','b','c'};
		sort(ch);
		String[] str= {"a","b","c","d"};
		sort(str);
		
		
		
		
		
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
	public static double sum(double a,double b,double c,double d) {
		return a+b+c+d;
	}
	//write a method called sort that can sort an int array in descending order
	public static void sort(int[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void sort(char[]arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
					}
		System.out.println();
	}
	
	public static void sort(String[] arr) {
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	}


