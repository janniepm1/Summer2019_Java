package Day05_recap;


public class Quizzes {
	public static void main(String[] args) {
		
		
		// int 7num =10 cannot starts with digit
		
		//double num= 10l ; long value can be assigned to double and float
		 
		/*multiple ways to declare main method 
		 * 1.static public void main(String[] args)
		 * 2. public static void main (String[] args)
		 * 3. public static void main(String... args)
		 */
		//char: declared within a number in ''
		//char: must be single character;
		//boolean result= 'C';
		//boolean takes only true or false
		// pwd:(print working directory) shows us which directory we are reading 
		//ls: list all the sources in the current directory
		//cd: change directory
		/*
		 \n or \r : new line
		 \t: horizontal tab paragraph space
		 \\:prints single slash ("\\")
		 \':prints single quote
		 \":prints double quote 
		 */
	
		
		
		/*
		 * primitives:
		 * byte:only takes whole # 
		 * short: only takes whole # 
		 * int:only takes whole # 
		 * long:only takes whole # 
		 
		 * float:can take decimal (must have F or f at the end)
		 
		 * double:can take decimals (uses more often)
		 * boolean:true or false statements only
		 
		 * char:character within single quote ''
		 also takes number ascii
		 range: double>float>long>int>byte
		 
		 */
	//java app are executed from top to botton

	    
	    	byte bNum= 127;
	    	// byte range :-128 to 127
	    	//byte bNum2=126.5 ; //byte only takes whole numbers
	    	
	    	short sNumb2 =1000;
	    	//short sNum =126.5; //short only take whole numbers 
	    	//bNum=sNum2; //short is greater than byte 
	    	
	    	sNumb2 = bNum; //sNum =127;
	    	System.out.println(sNumb2);
	    	
	    	short sNum3 =127;
	    	//bye bNum5 =sNum3; //short>byte
	    	  
	    	
	    	int intNum= 100;
	    	//int intNum2= 100.5; 
	    	System.out.println(intNum);
	    	
	    	// int takes whole numbers 
	    			// byte ByteNum= inte> byte 
	    			//short ShortNum= intNum; //int> short
	    			
	    	short ShortNum2= 105;
	    	intNum= ShortNum2;
	    	
	    	System.out.println(intNum); //105
	    	
	    	long LongNum = 100l;
	    	long LongNum2 =100l;
	    	
	  //  	byte ByteNum3 = LongNum;
	   
	    //	short ShortNum4:100l;
	    	//int IntNum3=100l;
	    	byte a=10;
	    	int b=30;
	    	short c= 40;
	    	  long LongNumber= a;
	    	  long LongNumber2= b;
	    	  long LongNumber3=c;
	    			
	    	float floatNumber2 =20.5f;
	    	  short al =10; byte bl=20; long cl=30; int dl=40;
	    	   float Floats= al;
	    	   float Floats2= bl;
	    	   float Floats3= cl;
	    	   float Floats4=dl;
	    	   System.out.println( Floats); //10.0;
	    	   
	    	   //double:
	    	   double DoubleNum1= 10l; // log is smaller than double 
	    	   double DoubleNmub2= 10.5f;
	    	   
	    	   
	    	   //boolean:
	    	   boolean result= true;
	    	   boolean result2= false;
	    	 
	    	   
	    	   //char: takes character, char values must be declared withing single quote
	    	   
	    	   char character1= 'A';
	    	   System.out.println(character1);
	    	   
	    	   //char character2= A;
	    	 // char character3= 'AA';
	    	   
	    	   //all the characters have representative number ;
	    	   
	    	   char charvalue =98;
	    	   System.out.println( charvalue);
	    	   
	 int num3='B';
	 System.out.println(num3); //66
	    	   
	    	   float fnum ='B';
	    	   System.out.println(fnum);// 66.0
	    	   
	    	   
	    	   byte bValue ='B';
	    	   System.out.println(bValue );//  66
	    	   
	    	   //float:
	    	   float fnum2= 5.5f; //5.5
	    	  
	    	   float fnum3 =5;
	    	   
	    	   
	    	   
	    	  //prectice:
	    	   
	    	   
	    	   /*8,9,#,@.,8.5, 5.5f
	    	    * 128,40000,9>10,true,false
	    	    */
	    	   
	    	byte Nnum=8; short Snum=8; int Inum=8;
	    	long LNum=8; float FNum=8; double DNum=8;
	    	char character=8 ;
	    	   
	    	System.out.println(Nnum);
	    	System.out.println(Snum);
            System.out.println(Inum);	
            System.out.println(LNum);
            System.out.println(LongNum);
            
            System.out.println(FNum);
            System.out.println(DNum);
            System.out.println(character);
	    	
            //# & @:
            char character2= '#';
            System.out.println(character2);
            
            char character3= '@';
            System.out.println(character3);
            char character4= 'Q';
            System.out.print(character4);
            
            
	    	   
	    	   }
	    
	    
	
	
	}


