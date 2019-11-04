
package day08_ShortHandOperators;

public class ShortHand {

	/*
	 * += addition assignment x+ =y
	 * -=: subtraction assignment x-+y
	 * *=: multiplication assignment : x*=y ==> x=x*y
	    /= d:division assigment 
	     * %=: REMAINDER ASSIGMENT X%=Y ==> X %=Y
	     *  
	     *  */
	 
	public static void main(String[] args) {
		 int a= 9;
		 //    a= a+3; //12
		   a+= 3; 
		   System.out.println(a);
	
	int  b= a+=5;// a=17
	//        12+5=17
	System.out.println(b);
	//a=17  b=17
	System.out.println(a);
	int c = a+=b; // a=34, c=34, b=17;
	 //		17+=17=34
	System.out.println(c);
	 int d=a+= c;// a=68 d=68 c=34 b=17
	 //		34+=34
	 System.out.println(d);
	 int e=(d+=b)*2;
	 //		68+17*2
	 //  85*2=170
	 
	 System.out.println(e); // d=85, b=17 e=170 c=34
	 System.out.println(d);//85
	 System.out.println(c);//34
	 System.out.println(b);//17
	
	 int f=b+=d *2;
	 //		b+=170
	 // 17 +170==> 187
	 System.out.println(f);
	 
	 //b=187
	 
	 // -=:
	 int g= 101;//g =100 , h=100
	 int h= g-=1;// 101-1== 100
	 System.out.println(h);
	 
	 int i=g+= h +5; //g =205 i=205 h=100
	 //   g=100+5=> 205
	 System.out.println(i);
	 
	 int j =h+= g%i ;// h=100, j=100
	 // 100+=205%205
	 // 100+=0
	 System.out.println(j);
	 
	 int k= j-=h *2% 5; //j=100
	 //          200%5
	 //100-=0
	 System.out.println(k);
	 
	 // multiplication
	 int A =100;
	 A*=200;//A= A*200
	 System.out.println(A);
	 //A =20000;
	 int B=100;
	 B*= 100/10;
	 //B*=100/10
	 System.out.println(B);
	 
	 B*= B-= 1000;
	 System.out.println(B);
	 
	 //   /=:
	 int C=1000;
	    C/=5;
	    System.out.println(C);//200
	    
	    int D=10;
	   //  C/= D-10; DENOMINATOR CANNOT BE 0
	    C/= D+10;// C/20==10
	    System.out.println(C);
	    
	    // %=: 
	    int Z= 10%3; // ==>10/3= 3..... REMAINDER: 10- 3*3=1
	    int E=10;
	    E %= 2; //E= 10%2
	    System.out.println(E);
	    
	    int F= 100;
	    F %=2; // F=F%2; ==>0
	    
	    System.out.println(F);// IF ITS 0 IT MEANS ITS EVEN NUMBER
	    
	    
	    
	 
	 
	 
		
	}
	
	
}
