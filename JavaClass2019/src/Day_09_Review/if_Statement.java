package Day_09_Review;

public class if_Statement {
	
	/* if statement :
	 * 			single if statement:  if =true 
	 * 					if(must take expression) boolean{
	 *						//some codes to run }
	 *			if block only gets executed if the condition is true
	 * 
	 * 
	 * 
	 */
 public static void main(String[] args) {
	 if (true) {
	System.out.println("hello");
	System.out.println("happy friday");
	System.out.println("tomorrow is day off");
	 }
	 int a =1000;// 1001
	  if (true) {
		  a= 2000;
		  
		  //1000= 1001 ==> false
		  System.out.println("a is increased");
	  }
	  System.out.println(a);
	  
	  int x=1974857012;
	   
	  if ( x%2==0 );{
		  System.out.println(x);
		  System.out.println("its an even number");
		  
		  
	  }
		
	  String CEO="Main boss";
	  String Kuzzat=" Main Boss";
	 System.out.println(CEO==Kuzzat);//true
	 
	 if (Kuzzat ==CEO ) {
		 System.out.println("Great person in the world");
		 System.out.println("First in block");
	 }
	  
	  if (Kuzzat != CEO) {
		  //FALSE
		  System.out.println("Great person in the worl ");
		  System.out.println("second if block");
	  
	  
	  
	  /*1. decleare a variable , and initialize user age 
	   * 2. write a program if the user is elegible to vote for Donald Trump
	   * VOTE AGE 18
	   */
		  
		  byte personAage= 78;
		  byte voteage= 18;
		  
		  if (personAage>= voteage) {
			  System.out.println("\n\n Yes you are elegible to vote");
			  System.out.println("Have fun building the wall");
			  System.out.println("MAGA");}
		  
	  
	if (personAage <voteage ){
		System.out.println("You are not ellegible to vote yet, please grow up");
		
	}
	  
		  
	  }
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 } 
	 }

