package day35constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class warmupmethodsArrays {
	/*
	 * 1.write a return method that accepts an int array and
	 * return it as an Arraylist
	 * 2. write a return method that accepts an Integer array
	 * and returns the maximum number
	 * 3. write a return method that accepts an Integer Arraylist and
	 * returns the second maximum number
	 * 4. write a return method that accepts an Integer array
	 * and returns the minimum number
	 * 5. write a return method that accepts an Integer arraylist and 
	 * returns the second minimum number
	 */
public static void main(String[] args) {
	//task1
	int[] arr= {1,2,3,4,5};
	ArrayList<Integer> list=ArrayToArrayList(arr);
	System.out.println(list);
	//System.out.println(ArrayToArrayList(arr));
	//task2
	double[] arr2= {1.2,3.5,24.6,35.7};
	ArrayList<Double> list2=ArrayToArrayList(arr2);
	System.out.println(list2);
	//task3
	ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
int max=MaxNum(list3);
System.out.println(max);
//task4
ArrayList<Integer> list4=new ArrayList<Integer>(Arrays.asList(10,20,35,30));
int secondMaximum=SeconMax(list4);
System.out.println(secondMaximum);
//task 5
ArrayList<Integer> list5= new ArrayList<Integer>(Arrays.asList(20,49,1,56,34,3));
int Minnum=MinimumNum(list5);
System.out.println(Minnum);

//task find second min
int[] numbers2= {100,9,8,700,18,9,0};
ArrayList<Integer> list6=ArrayToArrayList(numbers2);
int secondmin=SecondMin(list6);
System.out.println(secondmin);

}

//warmup1 int primitive array to arraylist
public static ArrayList<Integer> ArrayToArrayList(int[] arr){
	
	ArrayList<Integer> list=new ArrayList<>();
	for(int each:arr) {
		list.add(each);//auto boxing
		
	}
	return list;
}
//warmup2 
public static ArrayList<Double> ArrayToArrayList(double[] arr){
	ArrayList<Double> list=new ArrayList<>();
	for(double each:arr) {
		list.add(each);//auto boxing
		
	}
	return list;
}

public static int MaxNum(ArrayList<Integer> list) {//find maximum numr
	int max=Integer.MIN_VALUE;//wrapper class to prmitive
	for(int each:list) {//un-boxing
		if(each>max) {
			max=each;
		}
}
return max;
}

public static int SeconMax(ArrayList<Integer> list) {
	Integer max=MaxNum(list);//auto-boxing
	list.remove(max);	
	int secondmax=MaxNum(list);
	

return secondmax;
}

//task4
public static int MinimumNum(ArrayList<Integer> list) {
	int Min=Integer.MAX_VALUE;//wrapper class to primitive
	for(int each:list) {//un-boxing
		if(each<Min) {
			Min=each;
		}
	}
return Min;
}//second min
public static int SecondMin(ArrayList<Integer>list) {
	Integer firstmin=MinimumNum(list);
			list.removeAll(Arrays.asList(firstmin));
			return MinimumNum(list);
	
}
}

























