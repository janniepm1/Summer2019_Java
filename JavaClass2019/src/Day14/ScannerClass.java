package Day14;

import java.util.Scanner; //*imports all the class from java.util package
// everything in scanner class is imported
public class ScannerClass {
	public static void main(String[] args) {
	
	
	Scanner input= new Scanner(System.in) ;// declaration of scanner 
	System.out.println("Enter a Byte Value");
	byte byteNum=input.nextByte();//allows user to put a byte value
	System.out.println("You have entered :"+byteNum);
	System.out.println("Enter another Byte Value");
	byte byteNum2 =input.nextByte();
	System.out.println("You have entered:"+byteNum2);
	System.out.println("Addition is :"+(byteNum *byteNum2));
	
	Scanner in= new Scanner(System.in);
	
	
	
	

	
		// Scanner its a class that provides the methods to get user inputs
		//Scanner class presented in package called "java.util" package
		//in order to use scanner class, the scanner must be imported :import java.util.scanner;
		//it allows you to import scanner to class
		//the import statement must be placed b/t package and class
		// must be outside de class
	// declaration of scanner : Scanner variable name= new scanner(System.in); 
	
	
}
}