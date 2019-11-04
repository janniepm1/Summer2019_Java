package Day25Arrayscont;

import java.util.Arrays;

public class Practic2_2d_array {
	public static void main(String[] args) {
	int[][] arr2d= {{1,2},{3,4,5,6,7},{8,9}};
	//length method
	int length=arr2d.length;//will print 2
	//i because i started from 0
	for(int i=0; i<length;i++) {//i=0,1,2
		System.out.println(Arrays.toString(arr2d[i]));//print each single array one by one 
		}
	for(int i=0; i<length;i++) {//checks each index of elements within that 1d arr
		for (int j=0;j<arr2d[i].length;j++) {
		System.out.print(arr2d[i][j]+ ","); //it will print each character from arr2d
	}
	System.out.println();
	}//PRINT EACH ELEMENT ONE BY ONE 
	char[][] ch2d= {  {'A','B'}, {'C','D'}};
	
	for(int i=0; i< ch2d.length; i++) {
		for(int j=0; j<ch2d[i].length; j++) {
			System.out.print(ch2d[i][j]+",");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
