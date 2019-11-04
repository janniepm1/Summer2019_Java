package Day25Arrayscont;

import java.util.Arrays;

public class ArraysMethods {
	public static void main(String[] args) {
		int num1=10;
		System.out.println(num1);
		int[] arr= {1,2,3};
		System.out.println(arr);//you cannot print just arr you have to put the value inside brackets
		//to print entire array as whole, we need to convert the array to string 
		
		//how to print the array to string ==Arrays.toString(VariableName):
		//used for converting single dimensional arrays to string value 
		
		/*Arrays class:utility of all the arrays 
		 * anything you put inside parenthesis is a method
		 * Arrays class is presented in java util package
		 */
		
		String str=Arrays.toString(arr);
		System.out.println(str);
		
		String[] name= {"Elvira","Bibish","Tural","Dulet","Hakan"};
		System.out.println(name[0]);
		System.out.println(name);//hash code will print 
		System.out.println(Arrays.toString(name));// you have to import from arrays class
		
		
		/*
		 * Arrays.sort(variableName):sorts the values of the arrays in ascending order
		 * from smallest to larger
		 */
		
		int[] numbers = {9,8,100,3000,4,5,6};
		//System.out.println(numbers.toString(numbers));
		Arrays.sort(numbers);//creates a new value to the array from small to large 
		System.out.println(Arrays.toString(numbers));
		System.out.println("Maximum: "+numbers[numbers.length-1]);
		System.out.println("Minimum: "+numbers[0]);
		
		
		String[] NameList= {"Alma","Gulnur","Cinthya","Kevin","Sarah"};
		Arrays.sort(NameList);//alphabetical order (from AsCII TABLE)
		System.out.println(Arrays.toString(NameList));
		
		char[] ch= {'0','9','8','5','3','2','1'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));//will give from 0 and up in order 
		
		
		int[] nums= {2000, 90, 89 ,78,  65,555,444,-5};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("Minimum number: "+nums[0]);
		System.out.println("Maximum number: "+nums[nums.length-1]);
		System.out.println("Second maximum num: "+nums[nums.length-2]);
		System.out.println("Second minimun number: "+nums[1]);
		
		
		/*
		 * write a program that can sort the arrays in descending order (largest to smallest
		 */
		int[]	nums2= {2999, 3902,39824,209381,393,429};
		Arrays.sort(nums2);
		//numbers are from ascending numbers 
		System.out.println(Arrays.toString(nums2));
		String result="[";
		for (int i=nums2.length-1;i>0;i--) {
			result+=nums2[i]+",";
			//System.out.print(nums2[i]+" ");//from largest to smallest
		}
		System.out.println();
		result=result.substring(0,result.length()-2)+"]";
		System.out.println(result);
		
		//ascending order
		int[] arr2= {99,10,200,3000,40,50,5000};
		Arrays.sort(arr2);//array will be in ascending order 
		int[] descending=new int [arr2.length];//descending now is arr2[6]
		/*descending[0]=arr2[6];
		descending[1]=arr2[5];
		descending[2]=arr2[4];
		descending[3]=arr2[3];
		descending[4]=arr2[2];
		descending[5]=arr2[1];
		descending[6]=arr2[0];
		*/
		
		
		
	int j=0;
		for (int z=arr2.length-1; z>=0; z--) {
			descending[j]=arr2[j];
				z++;
		}
	System.out.println("Ascending order: "+Arrays.toString(arr2));
	System.out.println("Descending order: "+Arrays.toString(descending));
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
				}

