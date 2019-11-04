package Day40statickeyword;

import java.util.Scanner;

public class statickeyword {
	static Scanner scan=new Scanner(System.in);
	
 int a;
	 int b;//static variable
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				
		statickeyword  obj=new statickeyword();
		obj.a=100;
		
		statickeyword obj1=new statickeyword();
		obj1.a=200;
		
		System.out.println(obj.a);//100
		
		System.out.println(obj1.a);//200
		double num=100.5;//local variable   local variables cannot be use outside the method
		
		
		obj1.b=900;
		//System.out.println(statickeyword.b);
		System.out.println(obj1.a);
		System.out.println(obj.b);
		System.out.println("____________________________");
		statickeyword obj3= new statickeyword();
		obj3.a=100;
		System.out.println(obj3.a);
		
		statickeyword obj4=new statickeyword();//each object has its own copy
		
		System.out.println(obj4.a);
		obj3.b=400;
		System.out.println(obj3.b);//400 static can only be one copy\
		
		System.out.println(obj4.b);//will print 400 because its static variable 
		}
public static void method1() {
	int a=statickeyword.scan.nextInt();
}

public void printHello() {
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//System.out.println(num);// cannot call local variables if called will give you compile error
}

