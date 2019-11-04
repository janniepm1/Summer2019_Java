package Day28Lopps_Methods_arrays_recap;

import java.util.Arrays;

public class kahootquiz {
	public static void main(String[] args) {
		char[]	ch= {'a','b','c'};
		int z=ch.length;//3
		int count=0;//1`,
		
		while (count<z-1) {
			//count<2=0
			//2<2
			count++;
			System.out.println(count);
			}
		String[] arr= {"mARAL","Marulla"};
		arr[0]=arr[1];//marulla
		arr[1]=arr[1];//narulla
		System.out.println(Arrays.toString(arr));
		
		int nums[]= {5,4,3,2,1};
		for(int each:nums) {
			if(each==3) {//3 is going to be skipped
				continue;
			}
			System.out.println(each);
		}
		
		long[] Arr=new long[2];//0,0
		Arr[0]=5l;//[5,0]
		Arr[1]=10l;//[5,10]
		
		Arr=new long[4];//[0,0,0,0]
		Arr[2]=15l;//[0,0,15,0]
		Arr[3]=20l;//[0,0,15,20
		System.out.println(Arrays.toString(Arr));
		
		
		
		
		
		
	}
}
