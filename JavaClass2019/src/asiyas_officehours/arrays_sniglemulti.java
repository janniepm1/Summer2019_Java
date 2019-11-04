package asiyas_officehours;

import java.util.Arrays;

public class arrays_sniglemulti {
	public static void main(String[] args) {
		
		int[] number= {4,54,76,3435,656};
		System.out.println(number[0]+number[1]);//adding two indexes
		
		int[] num= {1,2,3};
		for(int each:num) {
			
			System.out.print(each*2+" ");
		}
		System.out.println();
		/*
		 * for (int i=0; i<num.length;i++){
		 * 			System.out.println(num[0])
		 */
		
		
		//2d arrays
		int[][] nums= { {10,20,30},{40,50,60},{70,80}};
		System.out.println(nums[2][1]);//80
		System.out.println(nums[1][1]);//50
	System.out.println();
	
	for(int i=0; i<nums.length;i++) {
		for (int j=0; j<nums[i].length;j++) {
			System.out.println(nums[i][j]);
		}
		System.out.println();
	}
		//5 day, jump 10 times
		
		for(int day=1; day<=5;day++) {
			System.out.println("day"+day);
			for(int jump=1;jump<=10; jump++) {
			System.out.print("Jumping"+jump+" ");
		}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
