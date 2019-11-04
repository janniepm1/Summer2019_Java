package day03_variables;

public class primitivedatatypes {
  /*
   * byte:we can assign whole numbers thats no decimal (whole numbers)
   must be within -128<=byte<=127
   short: we can only assign whole numbers. Must be within -32768<=short<32767
   int : we can only assign whole numbers must in -2,147,483,648<=int <=2147483643
   long:we can only assign whole numbers.Must be within -9223372036854775808<= long<=92233720372036854775808
    byte\<short<int<long
    small one can be be assign to a large one
    float: we can assign decimals (decimals must have f or F letters must be at the end)
    double: (used more often) and we can assign decimals.  
    the variables data type must be larger in order to contain another data type.
    all variables can be assign to float and double.
   */
	public static void main(String[] args) {
		byte length=3;
		System.out.println(length) ;
		byte width = 4;
		System.out.println(width);
		 
		//variable name rules:varibales must start with alphabet L/U case a-z
		// byte 9num=100 must start with a letter
		//byte num can only have _and $ sign 
		//variable name must be unique 
		 byte num_and$=90;
		 //byte lenght =6;  variable is not unique
		 //cannot be java reserved words
		 //byte public=10;	 //variable names cannot be java reserved words
		//byte mynum1= -129; out of byte 
		byte variableName =127;
		
		//short num2= &; we can only assign whole numbers
		//short num3= 10000; //out of range 
		
		int num4=-1_000_000_000; //easier to read
		long longNumber =10;
		//int intNumber =10l;
		byte byteNumber =10;
		short shortNumber= byteNumber;// short is greater than byte thats why looks like error
		int intNumber = -19876;
		long longNumber2= intNumber; // long is greater than int
		//left side of the = has to be equal than right side of =
		short shortNumber3 =-30000;
		short shortNumber4 = shortNumber3;
		System.out.println(shortNumber4);
		//int exampleNum1=10.5;
		float examplenum2=10.5f ;
		float examplenum3=20.5f ;
		
		double doubleNumber = 10.5;
		
		double doublenumber2 =30.5;
		//float floatNumber= doubleNumber2;  ;double data is larger than float data type
		byte bNum =10;
		short sNum =20;
		int iNum= 30;
		long lNum =40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("======================");
		
		float fNum =bNum;
		float fNum2=sNum;
		float fNum3=iNum;
		float fNum4=lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
		 
		System.out.println("=================");
		
		double dNum=bNum;
	    double dNum2=sNum;
	    double dNum3=iNum;
	    double dNum4= lNum;   
	    System.out.println(dNum);
	    System.out.println(dNum2);
	    System.out.println(dNum3);
	    System.out.println(dNum4);
	    
	    
		
		
		
		
	}
}
