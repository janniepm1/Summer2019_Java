package MethodsCalls;



public class methodclass {
	public static void main(String[] args) {
		method3();
		System.out.println();
		int max2=max(10,20);//20
		System.out.println(max2);
		
		int max3=max(100,200,50); //200
		System.out.println(max3);
		
		maximum(400,5000,99999);
		String str=print (10,20,30);
		System.out.println(str);
		}
	public static void method1() {
		System.out.println("A");
	}
	public static void method2() {
		method1();//A
		System.out.println("B");//B
	}
	public static void method3() {
		method2();
		System.out.println("C");//C
	}
	public static int max(int a,int b) {
		return (a>b)? a:b;
	}
	public static int max(int a,int b, int c) {
		//int largestnum= max(a,b);
		return (max(a,b)> c)? max(a,b):c;
	}
	public static void maximum(int a, int b, int c) {
		System.out.println(max(a,b,c));
		}
	public static String print(int a, int b, int c) {
		maximum(a,b,c);
		return "900";
	}
	public static int max(int a , int b, int c, int d) {
		int result=max(a,b,c);
		if(result>d) {
			return result;
		}
		return d;
	}
	public static int max(int a, int b, int c,int d,int e) {
		return max(max(a,b,c,d),e);
	}
}





