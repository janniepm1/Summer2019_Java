package Day21_whileLoops;

import java.util.Scanner;

public class whileloop_exercise {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Strting number");
	int start=scan.nextInt();//10
	
	System.out.println("Ending number");
	int end= scan.nextInt();//100
	
	for (int i=start;i<end ;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
		i++;
	}
	/*
	 * for loop to while loop
	 */
	int i=start;
	while (i<=end) {
		if(i%2==1) {
			System.out.print(i+" ");
		}
		i++;
	}
}
}
