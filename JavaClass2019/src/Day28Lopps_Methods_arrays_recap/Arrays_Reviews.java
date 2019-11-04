package Day28Lopps_Methods_arrays_recap;

import java.util.Arrays;

import day24_reviewarraysandloops.arraysmethods;

public class Arrays_Reviews {
	public static void main(String[] args) {
		
	
	/*\
	 * Single dimensional arrays:
	 * 3 ways to declare   these 3 same thing
	 * int[] arr1d={1,2,3,4,5}:
	 * int arr1d[]={1,2,3,4,5};
	 * int arr1d[]=new int[]{1,2,3,4,5}
	 * 
	 */
	int[] arr1d= {1,2,3,4,5,6,7};
	//index:     0,1,2,3,4,5,6
System.out.println(arr1d[2]);
	//initialize the size of 1d array:
	int[] arr=new int[3];//this array can contain 3 values[0,0,0]
	//to print the array:needs to be converted to string
	arr[1]=10;
	arr[0]=30;
	arr[2]=40;
	System.out.println(Arrays.toString(arr));
	
	int[] numbers = {10,20,30,40};
	for(int eachvalues:numbers) {
		if(eachvalues==20) {
			continue; //skips every single statements after the continue
		}//if we don't have break it will print 10,30,40
		System.out.println(eachvalues+" ");
		break;//exits loops immediately
	}
	System.out.println();
	
	int[] nums= {100,200,300,400};
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==300) {
			break;//after print it will print until 300		}
	}
		System.out.println(nums[i]+" ");//print only100,200
		
		System.out.println();
	/*
	 * Arrays util class: toString(),sort(),deepToString();
	 * 			toStringmethod():converting single dimensional array to string
	 * 			Sort(): sorting single dimensional array in ascending order
	 * 			deepToString():converting multidimensional array to string
	 */
					//sort():
		long[] larra= {20,40,400,300,10};
		Arrays.sort(larra);
	System.out.println(Arrays.toString(larra));
	
					//deeptoString():
	int[][] arr2d= {{1,2},{3,4}};
	//index          0      1
	System.out.println(Arrays.deepToString(arr2d));
	// in 2d array: [index number of 1d arrays][index number of values]
	
	System.out.println(Arrays.toString(arr2d[1]));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
	
}
