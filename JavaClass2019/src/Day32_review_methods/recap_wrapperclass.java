package Day32_review_methods;

import java.util.Arrays;

public class recap_wrapperclass {
	//quiz 08
	public static void main(String[] args) {
		int []arr= {30,20,10,5,0};
		Arrays.sort(arr);//0,5,10,20,30
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==30) {
				continue;
			//	count++; you cannot add anything after continue
			}
			System.out.println(arr[i]+" ");
	//answer is compile error because you have more statements after continue
			//question 4
		}
		int [] numbers={1,2,3,4};
		int num=findMax(numbers)	;
		
	}
	public static int findMax(int [] a) {
		return 1;
		
	
		
		
	}
	

}
