package Day25Arrayscont;

public class warm_up_task_uniquevalue {
	public static void main(String[] args) {
		//write a program that can print out the unique values from
		//an int array
		int[] arr= {1,1,2,2,2,2,2,2,2,3,4,4,8,9,7};
		//arr[j] will be a character from array on unique value 
		for(int j=0; j<arr.length; j++) {
		int count=0;//to find out how many time a value is appeared in the array
		for (int i=0;i<arr.length;i++) {//check the array one by one
			if (arr[i]==arr[j]) {//find out how many characters you have in the array ==1 if you want to check just one character 
				count++;//loops continues count will be increased by one 
			}
		}//if only appeared once we will print that value out 
		if (count==1) { //if(count !=1) it will print the values that are repeated
			System.out.println(arr[j]);//it will print unique characters 
		}
		}
	
		
		
		
		//write a program that can print out the unique values from string array
	
	
	
	
	
	
	}

}
