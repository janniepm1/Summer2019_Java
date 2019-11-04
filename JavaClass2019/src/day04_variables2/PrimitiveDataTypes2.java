package day04_variables2;

public class PrimitiveDataTypes2 {
	/*
	  byte, shotr ,int, long,float,boolean, char
	  boolean:either true or false expression.
	  anything that can return true/false can be initialized to boolean
	 char: 
	 ASCII Table :a universal system that is recognized by all computers. Each character in SDCI table have a corresponding number to represent it.
	 boolean: takes either true or false
	 char:declares with in the single quote''; single character only 
	 */

	public static void main(String[] args) {
		boolean result = true;
		boolean result2= false;
		boolean result3= 9>3 ;
		//boolean result= earch is flat      
		//boolean: takes all boolean expression,and returns either true or false
		 //boolen: num1= 100
		System.out.println(result);//true
		System.out.println(result2);//false
		System.out.println(result3);//true
		
		//char: single character value single quotation nessesary
		char char1='a';
		System.out.println(char1);
		char char2 ='9';
		System.out.println(char2);
		char char3 ='b';
		System.out.println(char3);
		
		//char with numbers, all the values from char comes from ascii table 
		
		char char4= 67;// prints character from ascii table
		System.out.println(char4);
		char char5='c'; // prints character as is it . does not read letters numbers only
		System.out.println(char5);
		char char6= '{';
		System.out.println(char6);
		char char7= 123;
		System.out.println(char7);// prints the character that has 23 on ascii table
		
		//initializing char to other primitives :byte .\,short,int, long, float, double
		char Mychar1='b';
		int myint= Mychar1; //the number represents b is initialized to the int
		System.out.println(myint); //98
		
		//byte Mybyte= Mychar1; // char's memory is 2byte, byte' memory is bytes
		byte Mybyte2= 'b';
		System.out.println(Mybyte2);
		
		// Short Num= Mychart1; // char' memory is could be bigger than short, range is great
		short ShortNum2 ='b';
		System.out.println(ShortNum2);
		
		long LongNum= Mychar1; // lonfg memory is 8 byte 
		long LongNumb2='b'; //98
		System.out.println(LongNum);
		
		float floatNum= Mychar1;
		float floatNum2= 'b';
		System.out.println(floatNum2); //98.8
		
		double doubleNum= Mychar1;
		double doubleNum2= 'b';
		System.out.println(doubleNum2); // 98.0
	}
}
