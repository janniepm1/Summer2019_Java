package Day_13;

public class quiz_review {
	public static void main(String[] args) {
	
		
		int MyValue=10000;
		int myMinIntValue= Integer.MIN_VALUE;
		int myMaxIntValue= Integer.MAX_VALUE;
		System.out.println("Integer Minimum value= "+myMinIntValue);
		System.out.println("Integer Maximum value= "+myMaxIntValue);
		System.out.println("Busted Max Value="+ (myMaxIntValue+1));

		System.out.println("Busted Min Value="+ (myMinIntValue-1));
		int myMaxIntTest=2_147_483_647	;
				
	
	Short myMinShortValue = Short.MIN_VALUE;
	Short myMaxShortValue= Short.MAX_VALUE;
	System.out.println("Short Minimum value= "+myMinShortValue);
	System.out.println("Short Maximum value= "+myMaxShortValue);
	
	Byte myMinByteValue = Byte.MIN_VALUE;
	Byte myMaxByteValue= Byte.MAX_VALUE;
	System.out.println("Byte Minimum value= "+myMinByteValue);
	System.out.println("Byte Maximum value= "+myMaxByteValue);
	
	
	
	long myLongValue= 100L;
	Long myMinLongValue = Long.MIN_VALUE;
	Long myMaxLongValue= Long.MAX_VALUE;
	System.out.println("Long Minimum value= "+myMinLongValue);
	System.out.println("Long Maximum value= "+myMaxLongValue);
	long biglongliteralvalue=2147483647L;
	System.out.println(biglongliteralvalue);
	
	short bigshortliteralvalue= 32767;
	
	int myTotal=(byte)(myMinIntValue/2);
	
	short mynewshortvalue=(short)(myMinShortValue/2);
	
	System.out.println("==================");
	
	byte Num1= 122;
	short shortnum=(short)250;
	int myintnum=(int)50;
	long longtotal=50000L+ 10L * (Num1+shortnum+myintnum);
	System.out.println(longtotal);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	}
	
	
	
	

}
