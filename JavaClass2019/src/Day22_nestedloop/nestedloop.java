package Day22_nestedloop;

public class nestedloop {
	public static void main(String[] args) {
		/*
		 * nested loop; loops inside another loop
		 * for(){
		 * for(){}
		 * }
		 * when do we use nested loop?
		 * outer loops repeats the inner loop
		 
		 */
		/*
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
	for(int z=0; z<5 ;z++) {
		for(int i=1; i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	/*
	 * print 5 stars in 5 lines
	 */
	int z=5;
	while(z>=0) {
	int e=1;
	while(e<=5) {
		System.out.print("*");
		e++;
	}
	System.out.println();
	z--;
	}
	/*
	 *    *
	 *    **
	 *    ***
	 *    ****
	 *    *****
	 *    ******
	 */
	System.out.println("\n\n");
	
	for(int o=1; o<=7; o++) {
		for (int p=1; p<=o; p++) {
			System.out.print("*");
		}
		System.out.println();
	}
	int a=1; 
	while(a<=7) {
		
		int b=1;
		while(b<=a) {
			System.out.print("&");
			b++;
		}
		System.out.println();
		a++;
	}
	for(int j=1; j<=5; j++) {
		for (int d=1; d<=j; d++) {
		System.out.print("x");
		}
		System.out.println();
	}
	for(int j=6; j<=0; j--) {
	
	for (int d=1; d<=j; d++) {
		System.out.print("x");
		}
		System.out.println();
	
	}
}
}
