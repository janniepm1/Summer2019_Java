package Day12_switchstatement;

public class warm_up {
	public static void main(String[] args) {
		int n1=5;
		int n2=5;
		int n3=5;
		
		if (n1==n2 &&n1!=n3) {
			System.out.println("n1 and n2 equal");
		
	    if(n2==n3 && n2 !=n1) {
			System.out.println("n2 and n3 are equal");
			}
		else if (n3==n1 && n1 !=n2) {
	       System.out.println("n3 and n1 equal");
		}
		else if (n1==n2 && n2==n3 && n1==n3);{
			System.out.println("all of them are equal");
		}}
		else  {
			System.out.println("non equal");
		}
		
	System.out.println("\n\n");
	

int num1=5, num2=5, num3=5;
 if (num1==num2 && num2 ==num3) {
	 System.out.println("all equal");
 }
 else if (num1== num2) {
	 System.out.println("num1 and num2 are equal");
 }
 else if (num2==num3) {
	 System.out.println("num2 and num3 are equal");
 }
 else if (num1==num3) {
	 System.out.println("num1 and num3 are equal");
 
 }
	
 else {
	 System.out.println("none of them are equal");
	}
	 

	 
	

//third : nested if 
int a=10, b=20, c=30;

if (a==b && b==c) {//if all are equal
	System.out.println("all are equal");
}
else {//if not all of them are equal
	if(a==b ) {//if a and b are equal
		System.out.println("a and b are equal");
	}
	else if (a==c) {//if a and c are equal
		System.out.println("a and c are equal");
	}
	else if (b==c) {//if b and c are equal 
		System.out.println("b and c are equal");
	}
	else {//if none of them are not equal
		System.out.println("none of them are equal");
	}
}
System.out.println("\n\n");

System.out.println("I like \'apple\' ");


}
}














 