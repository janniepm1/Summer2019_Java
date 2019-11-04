package review_array_wrapperclass_foreach;

import java.util.Arrays;
public class arraysreview_multiD {
	public static void main(String[] args) {
		
		/*
		 n dimensional array: contains(n-1) dimensional arrays
		 */
		int[] arr1d= {1,2,3};
		//index:          0 1 2 	0,1,2
		int[][] arr2d= { {1,2,3} ,{4,5,6} };
		//index				0        1
		System.out.println(arr2d.length);//2
		//index num1d arrays index num of each values
		
		//print 2:
		System.out.println(arr2d[0][1]);//
		
		//print:{4,5,6};
		System.out.println(Arrays.toString(arr2d[1]));
		
		//print:{{1,2,3} ,{4,5,6}}
		System.out.println(Arrays.deepToString(arr2d));//can print only two or more dimensional
		
		
		char[] ch= {'a','b','c','d','e'};
		
		for(char each: ch) {
			if(each=='c') {
				continue;
			}
			System.out.print(each +" ");//for each loop prints a b c d it will give you the value of array char
			
		}
		System.out.println();
		String[][] names= { {"Erhan","Holy","Denis","Cinthya","Jhon Snow"}, {"Muhtar","Mike","Ariya","Nina"} };
		//								0					1
		for(String[]  each1d:names) {
			//System.out.println(Arrays.toString(each1d));//print each array seperetetly
		for(String eachValue:each1d) {
			if(eachValue.equals("Holy")||eachValue.equals("Jhon Snow")) {
				continue;
			}
				System.out.print(eachValue+" ");
			}
			
		}
		
	}
}



