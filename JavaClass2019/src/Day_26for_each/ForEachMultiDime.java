package Day_26for_each;

import java.util.Arrays;

public class ForEachMultiDime {
	public static void main(String[] args) {
		//n dimesional array contains(n-1) dimensional arrays 
		int[] arr1d= {1,2,3,4};
		int[][]arr2d= { {1,2,3} , {5,6,7,8,9}	};
					//    0          1
		for(int each: arr1d) {
			System.out.print((each)+",");
		}
		System.out.println();
		for(int i=0; i<arr2d.length;i++) {
						//	counts the 1d arrays
			for(int j=0; j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j]);
			}
			}
		System.out.println("==============");
		
		//for each loop easy way to do it 
		
		for (int[] each1:arr2d) {
			for(int each2:each1) {
				System.out.print(each2+" ");
			}
			System.out.println();
			String [][] str2d= {{"Bibish","Syfo"}, {"Syfooo","Julia"}};
			for(String[] each2:str2d) {
				//System.out.println(Arrays.toString(each2));
			for(String values:each2 )	{
				System.out.println(values+" ");
			}
			}
			int[][] num2d= { {2,3},{3,4} };
			int[][][] num3d= {{{1,2}, {3,4} },{{5,6},{7,8,9} } };
			
			for(int[][] each2darray:num3d) {
				//each2darray:each2 dimensional arrays that are contained within the 3d array
				for(int[] each1darray: each2darray) {
					//each1darray:each single dimensional arrays that are contained 
					for(int eachvalues:each1darray) {
						//each values that are contained with 1d array
						System.out.print(eachvalues+" ");
					}
				}
			}
		}
		
		
		
	}
}
