package Day15Scanner_StringClass;

import java.util.Scanner;

;//imports scanner class only 
//import java.util.*;//imports all the classes from java util .
/*package name is java.util
 * class name:Scanner 
 * 
 */
public class ScannerClass {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Byte value");
	byte num=input.nextByte();//returns the user input
		
		//byte a=-1666; compile error  because f int  range 
	System.out.println("Enter short value");
	short num2=input.nextShort();
	
	 System.out.println("Enter a Int Value");
	 int num3=input.nextInt();
	 
	 System.out.println("Enter a long value");
	 long num5=input.nextLong();
	 
	// System.out.println("Enter a char value ");
	 //char char7=input.next()char();//
	  
	 System.out.println("wirte true or false");
	 boolean result=input.nextBoolean();
	 
	 System.out.println("Enter a float number");
	 float result9=input.nextFloat();
	 
	 System.out.println("Enter a String line");
	 String num4=input.nextLine();
	 
	 System.out.println("Enter a doule value ");
	 double result4=input.nextDouble();

	 
	}
	
	
	

}
