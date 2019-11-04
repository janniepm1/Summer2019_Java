package day29Returnmethod;

import java.util.Arrays;

public class returnmethodspractice {
	public static void main(String[] args) {
		//int max=sum(10,20);//the method does not return any value
		addition(10, 20);
		//System.out.println(addition(10,20));
		float num=addition(10, 20);
		System.out.println(num);
		int max=(int)maxnum(90, 200, 30);
		System.out.println(max);
		int[] arr2={38325,43452,54643,116346};
		
		int maxy=maximum(arr2);
		System.out.println(maxy);
	}
	public static void sum(int a,int b) {
		System.out.println(a+b);
		}
	public static int addition(int a,int b) {//must return a value
		return a+b;
		
	}//write a method that accepts 3 nums and return the largest number
	public static double maxnum(int c,int d,int e) {
		int[] arr= {c,d,e};
		Arrays.sort(arr);
		return arr[arr.length-1];
	}//write a method that accepts int array and returns max number from array
	public static int maximum(int []srr) {
	
	Arrays.sort(srr);
	return srr[srr.length-1];
	}

}
