package asiyas_officehours;

public class forloop {
	public static void main(String[] args) {
		
	
	for(int i=100;i>=97;i-- ) {// print numbers from 100 to 97
		System.out.print((i)+" ");
	}
	System.out.println();
//	String a="";
	for(int j=0; j<=10; j++) {// print even numbers
	 if(j%2==0) {
		 System.out.print((j)+" ");
	 }
	}
	System.out.println();
	for(int y=0; y<=10; y++) {//print odd numbers
		if(y%2==1) {
			System.out.print((y)+" ");
		}
	}
	System.out.println();
	for(int z=10; z<=13;z++) {
		System.out.print((z)+" ");
	}
	System.out.println();//Conbine string with for loop
	String name="java";
for(int i=0; i<=3; i++) {//i will become a number 
		System.out.print(name.charAt(i)+" ");// it will print j a v a 
	}
System.out.println();//starting point is the length or in this case 3
for (int i=3; i>=0;i--) {//print backwards
	System.out.print(name.charAt(i)+" ");//if it goes down it has to decrease
}
 















	
	
}
}
