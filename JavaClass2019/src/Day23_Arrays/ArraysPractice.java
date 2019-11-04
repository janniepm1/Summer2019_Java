package Day23_Arrays;

import java.util.Scanner;

public class ArraysPractice {
	public static void main(String[] args) {
		String student1="Ibrahim";
		String student2="Zuleyha";
		String student3="Elina";
		
		String[] allStudents= {"Ibrahim","Zuleyha","Elina"};
							//0		1	2
		allStudents[0]="Marufjon";
		//allStudents[3]="Muhtar"arrays size if fixed
		System.out.println(allStudents[0]);
		System.out.println(allStudents.length);
		//initialize the size only without giving values:
		int[] array=new int[4];//we only give size we haven't give values to array
		//this array can contain four values, its length is 4
		
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[0]);//you didn't initialized any value
		
		//int[] array2;  //arrays size must be initialize
		//give values to array 
		array[1]=100;
		System.out.println(array[1]);
		array[0]=200;
		System.out.println(array[0]);
		
		//array[5]=500;
		//System.out.println(array[5]); wil give you error
		int[] array2;
		System.out.println(array[0]);//array size must be initialized
		Scanner scan=new Scanner(System.in);
		int[] Inputs=new int[5];//in this array we can store 10 elements, highest num is 9
		for (int i=0; i<Inputs.length;i++){
			System.out.println("Enter a number ");
				Inputs[i]=scan.nextInt();
	}
	for(int i=0; i<Inputs.length;i++) {
		System.out.println(Inputs[i]+"");
	}
		String[] AllStudentNames=new String[358];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}