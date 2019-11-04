package review_array_wrapperclass_foreach;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_reviews {
	/*
	 * array: store multiple data to a variable
	 * arrays size is fixed
	 */
public static void main(String[] args) {
	
	int num=10;
	
	//declaration of array:
	int[] arr= {10}; //array has size of 1; 10
	System.out.println(arr[0]);
	
	//initializing the arrays size
	
	int[] arr2=new int[2];//after this size is 0,0
	
	System.out.println(arr2[1]);//only can print index 0,1
	
	String[] cars=new String[5];//this array contain 5 string values
	//{Tesla,Audi,Toyota,Jeep,Subaru};
	
	cars[4]="Subaru";
	cars[2]="Toyota";
	cars[1]="Audi";
	cars[3]="Jeep";
	cars[0]="Tesla";
	for(int i=0; i<=cars.length-1;i++) {
		System.out.print(cars[i]+" ");//i represent the index num
	}
	cars=new String[10];//you reinitialized the array you cannot use previous variables
	cars[5]="Ford";
	System.out.println();
	boolean[] bool= {10>9,"Mikray".equals("Seyfo")};
	boolean b1=bool[0];
	
	System.out.println(b1);
	//convert arrays .toString prints the whole string it converts one dimensional arrays to string
	
	String str=Arrays.toString(bool);
	System.out.println(str);//true, false
	System.out.println();
	
	//arrays.sort():sorts the arrays in ascending order
	double[] darray= {1000,900,800,700,600};
	System.out.println(Arrays.toString(darray));
	System.out.println();
	
	//expected result:
	Arrays.sort(darray);
	System.out.println(Arrays.toString(darray));
	
	System.out.println();
	
	//print in descending order
	int[] numbers= {200,300,20,7890,40,-9,-100};
	Arrays.sort(numbers);
	System.out.println(Arrays.toString(numbers));
	String result="";
	for(int i=numbers.length-1; i>=0;i--) {
		result+=numbers[i]+",";
	}
	result=result.trim();
	result=result.substring(0,result.length()-1);
	//optional result=result.substring(0,result.lestindexof(",");
	//result=result.substring(0,result.lastind
	System.out.println(result.trim());
	System.out.println();
	
	//arrays with scanner
	//ask user to enter 3 nums and find the maximum nums 
	Scanner scan= new Scanner(System.in);
	System.out.println("How many nums would you like to add?");
	int number=scan.nextInt();
	int[] arrs=new int[number];
	
	
	for(int i=0;i<arrs.length;i++) {
	
	System.out.println("enter a nums: ");
	arrs[i]=scan.nextInt();
	}
/*	System.out.println("enter a nums: ");
	arrs[1]=scan.nextInt();
	System.out.println("enter a nums: ");
	arrs[2]=scan.nextInt()
	*/
	
	System.out.println(Arrays.toString(arrs));
	Arrays.sort(arrs);
	System.out.println("Minimum value"+arrs[0]);
	System.out.println("Maximum value"+arrs[arrs.length-1]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}