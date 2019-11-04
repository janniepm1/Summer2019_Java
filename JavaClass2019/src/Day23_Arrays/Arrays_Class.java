package Day23_Arrays;

public class Arrays_Class {
	public static void main(String[] args) {
		/*
		 * arrays : you csn give more values than regular variable
		 */
		int[] arr= {1,2};
		//datatype arr will be your variable name variable name can have any name
		
		String[] names= {"Nigar","Summeyya","Madina","Juline"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		String str1=names[2];
		String str2=names[3];
		
		System.out.println(str1);
		System.out.println(str2);
		
		//System.out.println(names[4]); error because you dont have that index
		
		double[] myarray= {1,2,3,4,5,8,0,2};
		//		index:		0,1,2,3,4,5,6,7
		
		for(int i=0; i<=7; i++) {
			System.out.println(myarray[i]+" ");
		}
		System.out.println();
		
		String str="abc";
		int a=str.length();
		System.out.println(a);//3
		
		int[] numbers= {12,24,48,96,2,3,4,5,6,7,8,9,10,11};
		//length of array:
		int b=numbers.length;
		System.out.println(b);
		int HighestIndexNum=numbers.length-1;
		System.out.println(HighestIndexNum);
		
		//how to print all the numbers on the console with loops 
		for(int i=0; i<numbers.length;i++) {
		int s1=numbers[i];
		System.out.println(s1);
		}
		System.out.println();
		
		//IF YOU HAVE TO FIND THE HIGHEST INDEX OF CHAR ARRAY
		
		char[] mychars= {'A','B','C','D'};
		int HighestIndexNum2=mychars.length-1;
		System.out.println(HighestIndexNum2);
		
		
		
		
		
		
		
		
		
		
	
	}

}
