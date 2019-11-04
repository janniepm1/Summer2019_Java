package Day25Arrayscont;

import java.util.Arrays;

public class MultidimensionalArray {
	/*
	 * n dimensional array contains multiple (n-1) dimensional array
	 */
public static void main(String[] args) {
	int[] arr1D= {1,2,3};
	// 2 dimensional array: array that contains multiple 1 dimensional array
	int[][] arr2D= {  {1,2,3} , {4,5,6} };
	
	String [] arr= {"A","B"};
	//                     0,1       0,1
	String [][] atr2D= {{"A","B"},{"C","D","E"}};
						//index0  index1
	//[represent the index number of 1 dimensional arrays][represent the index number of the values 
	
	//print A:
	System.out.println(atr2D[0][0]);//A because 
	System.out.println(atr2D[1][1]);//d
	System.out.println(atr2D[1][2]);//e
	System.out.println(Arrays.toString(atr2D[0]));//[A,B]
	System.out.println(Arrays.toString(atr2D[1]));//[c,d,e]
	System.out.println(Arrays.deepToString(atr2D));
	
	//single array to string to print only one index of whole array
	
	//ArraystoString(variablename); converts multi dimensional arrays to string
		//print[[a,b],[c,d,e];
	//					0,1		0,1		0,1
	int[][] numbers2d={ {1,2},{3,4},{5,6,7,8,9,10}};//only one dimensional array
	//index 0,1,2
	//print 6
	System.out.println(numbers2d[2][1]);//prints 6
	System.out.println(numbers2d[2][5]);
	//for nums you dont need to convert to arrays.tostring only for words or letters
	System.out.println(Arrays.toString(numbers2d[2]));//converts the whole string to print
	
	//print entire 2d array
	System.out.println(Arrays.deepToString(numbers2d));
	
	//3 dimensional arrays contains multiple 2 dimensional arrays 
	
	int[][] Array2d={ {1,2},{3,4}};
	int[][][] Array3d= { {{1,2},{3,4}} , { {5,6},{7,8}} };
	//							0               1
	//[index numbers of 2d array][index number od 1d array][index number of value]
	//print 8
	System.out.println(Array3d[1][1][1]);
	//print{5,6};
	System.out.println(Arrays.toString(Array3d[1][0]));
	//if it is 3 d you can print by putting 3 brackets but if its 2 dimensional you have to convert it to string 
	//print 5,6,7,8
	System.out.println(Arrays.deepToString(Array3d[1]));
	//to convert multiple need to use deep to string
	//using multi you have to use deep
	//print entire array
	System.out.println(Arrays.deepToString(Array3d));
	
	
	int[][][] numbers3d= {	{{1,2}}	, {{3,4}}	};
	//4 dimensional array contains multiple dimensional arrays 
	int[][][][] numbers4d= {{ {{1,2}},  {{3,4}} , {{4,5}}, {{6,7}}} };
	
	
	
	
	
	
	
	
	
}
}