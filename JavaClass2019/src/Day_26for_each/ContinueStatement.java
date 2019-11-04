package Day_26for_each;

public class ContinueStatement {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			if(i>2) {
				continue;
			}
			System.out.println(i+" ");
		}
		System.out.println();
		
		int[] numbers= {1,2,3,4,5};
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]<3) {
				continue;//make sure to write this after the if 
			}
			System.out.print(numbers[i]+" ");
		}
	}

}
