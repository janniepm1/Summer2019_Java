package Day_10IfStatement;

public class SingleIfStatement {
	public static void main(String[] args) {
		/* 
		 * single if:
		 * if (boolean) expression can use only with boolean expression
		 * 
		 */

		//task 2
	int hours=14; //2pm
	int minutes=45;
	int seconds=30;
	
	String amOrpm="am";
	System.out.println(hours+":" +minutes+" "+seconds+" "+amOrpm);
	
	
	
	//task03:
int n1=100, n2=500,n3=700;
int maximum=0;
 /*in order to n1 be the maximum: n1>n2&& >num3
  * in order to num2 be the maximum; n2>n1 &&n2>n3
  * in order to n3be the maximum: n3> nu1 &&n3>n2
  */
	if (n1 > n2 && n1 > n3) {
	maximum=n1;
	System.out.println("maximum number is "+n2);
	}

	if (n2 > n1 && n2 > n3) {
	maximum=n2;
	}

	if (n3 > n1 && n3 > n2) {maximum=n3;
	}
	
	System.out.println("Maximum number is " +n3);
	

	//task 4
	int statuscode=200;
	
	String finalresult="invalid status code";
	
	if(statuscode==200) {
		finalresult= "ok";
		  System.out.println("status code"+statuscode+" is: "+finalresult);
	}
	if (statuscode==201) {
	    finalresult="created";
	    System.out.println("status code"+statuscode+" is: "+finalresult);
	}    
	if (statuscode==404) {
		finalresult="not found";
		
	
   System.out.println("status code"+statuscode+" is: "+finalresult);
	}

	//TASK5
	int num= 100;
	String str="zero";
	/*number to be positive: number has to be >0,
	 * number to be negative :number<0,
	 * number to be 0: number ==0,
	 */
	if (num > 0) {
		str="positive";
		System.out.println(num+"is"+str);
	}
	if(num<0) {
		str="negative";
		System.out.println(num+"is"+str);
	}
	
	int num2=5000;
	if (num2>0) {
	}
	
	
		
		
	
	
	
	
	
	
	
}
}

	
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
