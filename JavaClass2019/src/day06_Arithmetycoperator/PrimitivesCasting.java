package day06_Arithmetycoperator;

public class PrimitivesCasting {
	private static final float DecimaNumber = 0;

	public static void main(String[] args) {
		
		
	/*casting: converting larger primitive to smaller size
	 datatype variablename=(datatype) value
	 casting: expliciti and implicit
	 
	 * primitives:byte,chort,int,long, float, double
	  */
	  
		//explicit casting: you have to do it manually 
		int a=128;
	  byte b=(byte)a;  //explicit casting
	  System.out.println(b);
	  double DecimalNumber =10.5;
	  float FloatNumber= (float) (DecimalNumber);//decimal number;
			  System.out.println(FloatNumber);
	  
			  long LongNum =300L;
			  int IntNum =(short)LongNum;
			  System.out.println( IntNum );
			  //implicit casting:automatic changes to smaller sixze to a larger size
			  
			  
			  byte ByteNum =100;
			  int IntNum2= ByteNum;
			  //same with:
			  int IntNum3 =(int) ByteNum;
			  
			  short ShortNum=100;
			  long LongNum2= ShortNum; //implicit is done by compiler
			  //same with 
			  long LongNum3 = (long)ShortNum;//implicit casting
			  
			  //explicit casting practices: from smaller to larger
			  
			  double LargestNumber= 100.8765;
			  byte ByteValue=(byte) LargestNumber;
			  
			  System.out.println(ByteValue);
			  // 100
			  float FloatValue=(float)LargestNumber;
			    						//100
			  System.out.println(FloatValue);// 100.0
			  float FloatValue2= (int)LargestNumber;
			  float FloatValue3=(byte)LargestNumber;
			  float FloatValue4= (short)LargestNumber;
			  float FloatValue5= (long)LargestNumber;
			  System.out.println(FloatValue); 
			 
			  
			  float FloatNumber2= 500.67F;
			  
			  	float mynumber= (FloatNumber2);
			  //
			  System.out.println(mynumber);
			  
			 /* int Num1 =100;
			  int Num2 =200;
			  int Num3 =300;*/
			  
			  
			  int Num1=100 , Num2=200, Num3= 300;
			  
			  
			  boolean result=true;
			  System.out.println(Num1 + "\t"+Num2 +" \t"+Num3);
			  
			  
			  char Character1='A';
			  System.out.println(Character1);
			  
			  
			  boolean result1, result2, result3;
			  //need to give them variables
			  
			  
			  
			  
			 
			  
	}

}
