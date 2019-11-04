package Day40statickeyword;

public class StaticPractice {
	static long num1;
	long num2;
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(StaticPractice.num1);
	//	System.out.println(num2);//first you need to call it through the object
		StaticPractice num2=new StaticPractice();
		System.out.println();
		StaticPractice.method1();//static 
		
		//StaticPractice.method2();
		StaticPractice obj=new StaticPractice();
		obj.method2();
		obj.method1();
	}
public static void method1() {
	System.out.println("A");
}
public void method2() {
	System.out.println("B");
}
}
