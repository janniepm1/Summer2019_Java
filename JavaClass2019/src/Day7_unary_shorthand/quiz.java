package Day7_unary_shorthand;

public class quiz {
 public static void main(String[] args) {
	 
	//question 01:
	 int a=30;
	 
	 int b=(byte) a;
	 System.out.println(b);// 30
	 // question 2 you cannot put a30 after you print the result
	 
	 //question 3
	 System.out.print("result a"+0+1);
	 //result a0+1   	//resultA01
	 System.out.print(";result b"+(1)+(2)+"\n");
	 //result b12
	 
	 //question4
	 System.out.println("5+2="+3+4);
	 //					"5+2=3"+4
	 //					"5+4+34
	 
	 
	 
	 //question 5
	 
	 float FloatNum=100.98765432f;
	 short ShortNum= (byte)FloatNum;//100
	 //byte short int and long only whole num
	 //you can use only short or byte because is explicit from larger to small
	 
	 System.out.println(ShortNum);
	 
	 //question6
	 byte BNum=127; // compyle error 200 byte maximum capacity is 127
	 System.out.println(BNum);
	 
	 
	 //question7
	 
	 System.out.println((3+2)*2/3%2);
	 //					5*2/3%2
	 //					10/3%2
	 //					3%2
	 //                  1
	 
	 
	 //question08
	 int num1=9, num2=1 , num3= num1/num2;
	 System.out.println(num3);
	 
	//denominator cannot be 0 if it is will be compyle error 
	  
	 
	 //question 9
	 long Lnum=3000l; 
	 double Dnum=(float)Lnum; //NARROWING
	 int Inum=(short) Dnum;
	 
	 System.out.println(Inum%1000);// 3000%1000=0
	 
	 //question10
	 double result1=10/3;
	 //result1=3;==>3.0
	 System.out.println(result1);
	 System.out.println(10.0/3);
	 
	 
	 //question12
	 String str="10.5";// string of text
	 // text cannot convert to number 
	 
	 //question13
	 int I1= 10, I2=20, I3=30;
	 I1= I1%5;//10%5=0 I1=0
	 I2=I2%5;//20%5=0 I2=0
	 I3=I1*I2; //I3=0;
	 System.out.println(I1+"\t"+I2+"\t"+I3);
	 
	 System.out.println(10/3l);
	 System.out.println(10/3f);
			 System.out.println(10/3d);
			 
			 float yy=10.7f;
			 double uu=10.9;
	 
	 
	 
	 
	 
	 
	 
	 
		
	
}
}
