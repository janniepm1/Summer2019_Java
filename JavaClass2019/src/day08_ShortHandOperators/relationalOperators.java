package day08_ShortHandOperators;

public class relationalOperators {
	/*
	 * relational operators: returns boolean expression
	 >;greater than 
	 >=;greater than or equal
	 <:less than 
	 <=:less than or equal
	 ==:equal
	 !=:not equal
	 =:assign
	 !: exclamation mark on java means the logical opposite
	 
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println(10>9);// true
		boolean resultA= 10>9;
		System.out.println(resultA);
		System.out.println(10>=9);// GREATER OR EQUAL 
		
		boolean resultB= 10>=9;
		System.out.println(resultB);
		
		boolean resultC= 10<=9; // LESS THAN OR EQUAL TO 
		System.out.println(resultC);
		
		boolean resultD= 1100<1200;// LESS THAN 
		System.out.println(resultD);
		
		boolean resultE= 1000<1000;
		System.out.println(resultE);
		
		boolean resultF = 1000<= 1000;
		System.out.println(resultF);
		
		//==
		boolean resultG=19==19; //EQUAL
		System.out.println(resultG);
		
		// ! 
		boolean resultH = 20!=20;
		System.out.println(resultH);
		
		boolean A= !false; //true
		System.out.println(A);
		 boolean B= !true;//false
		 /*
		  * in java true=true, false==false
		  * ! false equal to true, !true equal to false 
		  * so therefore : !false does not equal !true
		  * 
		  */
		 
		boolean C =!false !=!true;
		System.out.println(C);
		
	 boolean D= true == !false;
	 System.out.println(D);
	 
	 
	 
	 
	 
	 
		
	}

}
