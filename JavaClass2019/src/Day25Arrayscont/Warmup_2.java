package Day25Arrayscont;

public class Warmup_2 {
	public static void main(String[] args) {
		
		
		//write a program that can print out the unique values from string array
		
		String[] arr= {"C","A","A","M","M","J","C"};
		//index:		0,1,2,3,4,5,6
		// how many time "A" is appeared in the array 
		for (int j=0;j<arr.length;j++) {
			
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i].equals(arr[j])) {
				count++;
			}
		}
		if (count==1) {
		System.out.println(arr[j]);
	}

}
}
}