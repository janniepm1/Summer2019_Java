package Day27_customMethods;

public class VoidMethod_WithArgument {
	/*
	 * Method with argument:
	 * access modifier specifier return type (parameter){
	 * parameter can be any data type
	 * 
	 */
	public static void main(String[] args) {
		//OddOrEven(8);//method was design to take an argument needs the argument in order ti 
		//perform its task
		//need to provide a value that can be assigned to the parameter of the method
	int z=100;
		//int z; local variables must be initialized before use
		OddOrEven(z);
		TwoNums(10,20);
		OddOrEven(z);
	}
	public static void OddOrEven(int a) {
		if(a%2==0) {
			System.out.print(a+" Even Number");
		}else {
			System.out.println(a+" Odd number");
		}
		}
	
	public static void TwoNums(int a ,int b) {
		System.out.println("Sum of "+a+" "+b+" is:"+(a+b));
		
	}
	
	
	
	
}



