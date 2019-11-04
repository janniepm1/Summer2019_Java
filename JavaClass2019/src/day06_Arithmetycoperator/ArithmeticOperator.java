package day06_Arithmetycoperator;

public class ArithmeticOperator {
	/*
	 +: Addition,  adds two numbers together
	 -: subtraccion, subtracts a number
	 *: multiplication :multiplyes the number 
	 /:ddivision, divides
	  %:remainder: returns the remainder form division
	  
	 
	 */
 public static void main(String[] args) {
	 int a=100;
	 int b=a-400;//-300
	 System.out.println(b);
	 
	 int c=a+b; //100+-300=-200
	 System.out.println(c);
	 
	 int x=3, y=5 ,z= x*y;
	 System.out.println(z);
	 
	 double length=100, width= 10 , area=length*width;
	 System.out.println(area);
	 System.out.println(3+5+4-2);//10
	 //8+4-2=10
	 
	 double resultNum=9/3;// denominator cannot be 0 zero
	 System.out.println(resultNum);
	 
	 double Number1=10.0/3.0;// if you dont put the f is going to give you int num
	 //
	 System.out.println(Number1);
	 
	 int outcome=12+6/3;
	 //18/3+6)
	 System.out.println(outcome);
	 
	 System.out.println(10/2-3);
	  
	 
	 //% : returns the remainder
	 /* 10/3= 3 with remainder of 1
	  *  12/5= 2 with remainder (12-(5*2));
	  *  20/3 =6  :(20-(6*3))
	  */
	 
	 int result1 =10%3; //1
	 System.out.println(result1);
	 System.out.println(12%5);//2
	 
	 //20,45 ,65,67,68
	 //even : can be divided by 2 without a remainder
	 //odd: divided by 2, will have remainder
	 
	 int Number20= 20% 2;//even
	 int Number65= 65% 2; //odd (65-32*2)=1
	 int Number45= 45% 2;//odd
	 System.out.println(Number20);
	 System.out.println(Number45);
	 System.out.println(Number65);
	 System.out.println(4+17%2-1);
	 //                 4+1-1=4
	 System.out.println(6-3*2+7-1);
	 /* first come first serve ,except vip
	  * vip: %,/,*
	  * solve first in parenthesis,%,/,*
	  */
	 
	 System.out.println(3+4*4+5*(4+3));
	 System.out.println((4+17)%2-1);
	 
	 
}
}
