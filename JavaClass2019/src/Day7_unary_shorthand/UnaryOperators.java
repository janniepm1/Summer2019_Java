package Day7_unary_shorthand;

public class UnaryOperators {
	public static void main(String[] args) {
		/* 
		 +:positive
		 -:negative
		 ++:increment 
		 --:decrement 
		 
		 
		 + and- toguether =-
		 - and - =+
		 + and += +
		 */
		int a =10;
		int b=-10;
		System.out.println(b);
		int c=+b; //+(-10)== -10
		System.out.println(c);
		int d=-c; //-(-10) ==>10
		int f=-(10);
		//increment :increase the value by1.
		//increments are : pre increment:operator is placed before the variable increases the value inmidiatly
		int num1=100;
		System.out.println(++num1);
		int num2=++num1;
		System.out.println(num2);
		//post increment: operator is placed after variable at next stage 
	int IntNum=100;
	System.out.println(IntNum ++);//100
	System.out.println(IntNum);//101
	
	int IntNum2 =IntNum ++; //intnum2=101
	System.out.println(IntNum2);
		System.out.println(IntNum);//101
		//decrement: decrease the value by 1.
		int x=100;
		int y=x++-1;
		//y=100-1
		System.out.println(y);
		
		//decrement: decreases the value by 1
		//pre decrement: operator is placed before the variable.
		//decreases the value by on immediatly.
		int Z=100;
		Z--;
		System.out.println(--Z);//99
		
		//post decrement : operator is placed after the variable 
		//it will pass the current value ,and then decreased by 1
		int Y=95;

		System.out.println(Y--);//95 CURRENT VALUE FIRST 
		System.out.println(Y);
		 
		int T=25;
		System.out.println(++T);//26
		System.out.println(--T);//25
		
		int P=50; //49
		P=--P + P++ + P-- + P++;
		//PRE  POST   POST   POST
		//49 + 49  +  50  + 49  
		
		System.out.println(P);
		
		short Snum=4; //3
				int R= Snum*4- Snum--;
		//        16     -  4=12
				System.out.println(R);//12
				System.out.println(Snum);
				
				
				
				
				int W=1;//0
				 W=-W--+W++/-W--*--W;
				 // POST+POST POST PRE
				 //-1 + 0/-1*-1
				 System.out.println(W);
		 int G=2;
		 int H=G++;
		 System.out.println(H);
				 
		
		
		
		
		
		
		
		
	}

}
